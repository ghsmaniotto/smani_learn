## Cohesion

- All attributes and methods of a class must be related with the class.
- The class must have only one responsibility. Classes with no cohesion have many resposibilities.

```ruby
# With cohesion

class Employee {
  name
  cpf
  salary
  role

  def isManager?
    role == MANAGER
  end
}
```

```ruby
# With no cohesion

class Employee {
  name
  cpf
  salary
  role
  address
  number
  zip_code
  district

  def formatCPF
    # Format employee cpf
  end
  
  def formatZipCode
		# Format employee address zicode
  end

	def completeAddress
		# Get address info from external service
  end
}
```

## Encapsulation

- It refers to the bundling of data and the methods that operate on that data into a single unit. For example, many programming languages use encapsulation frequently in the form of classes.
- Getters and setters are not the best option to encapsulate a class. Instead, we need to provide only the necessary methods to the external world.
- Example:

```ruby
# Well encapsulated
# Here the employee salary is well keeped 
# The raise salary method have it own validations, it protects
#  the salary attribute. The class is well encapsulate.

class Employee {
  def raiseSalary(raise_amount)
    if(self.salary * 0.4) > raise_amount
      throw 'The raise amount must be lower than 40%'
    end

		self.salary += raise_amount
  end 

  private
  
  name
  cpf
  salary
}
```

```ruby
# Bad encapsulated
# There are no validations to emloyee salary, anyone can set
#   any value to the salary. The class is bad encapsulated.

class Employee {
  def setSalary(salary)
		self.salary = salary
  end 

  private
  
  name
  cpf
  salary
}
```

## Coupling

- Group two different classes, where a class knows much more thing that necessary about other class.

```ruby
# Without coupling
# Here, we don't know how the system calculates the readjustments.
#  The employee class is the only one responsible for doing that.
#  There is no coupling code here.

employee = Employee()
return employee.calculateReajustments()
```

```ruby
# With coupling
# Here, we know a lot about readjustments calculation.
#  For every readjustments calculation change, we need to change 
#    all places that use this.
# There is a lot of coupling codes here.

employee = Employee()
readjustments = employee.readjustments()
value = 0
readjustments.each{|r| value += r.value }
return value
```
