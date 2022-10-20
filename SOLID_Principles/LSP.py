class Car:
    def __init__(self, type):
        self.type = type
        self.car_properties = {}

    def set_properties(self, color, gear, capacity):
        self.car_properties = {"color": color, "gear": gear, "Capacity": capacity}

    def get_properties(self):
        return self.car_properties


class Electric_Car(Car):
    def __init__(self, type):
        self.type = type
        self.car_properties = {}


Car = Car("Sedan")
Car.set_properties("Black", "Auto", 6)

electric_car = Electric_Car("Tesla")
electric_car.set_properties("Blue", "Manual", 4)

Cars = [Car, electric_car]


def Find_Red_Cars(Cars):
    red_cars = 0
    for car in Cars:
        if car.get_properties()['color'] == "Red":
            red_cars += 1
    print(f'Number of Red Cars = {red_cars}')


Find_Red_Cars(Cars)
