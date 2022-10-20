from abc import abstractmethod


class CallingDevice:
    @abstractmethod
    def make_calls(self):
        pass


class MessagingDevice:
    @abstractmethod
    def send_sms(self):
        pass


class InternetbrowsingDevice:
    @abstractmethod
    def browse_internet(self):
        pass


class SmartPhone(CallingDevice, MessagingDevice, InternetbrowsingDevice):
    def make_calls(self):
        pass

    def send_sms(self):
        pass

    def browse_internet(self):
        pass


class StationaryPhone(CallingDevice):
    def make_calls(self):
        pass
