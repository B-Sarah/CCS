package ccs.archi.interfaces;

import java.util.List;

import ccsM2.InterfaceElement;

public interface IObserver {
	List<IObservable> AddObservable(IObservable anObservable);
	void ReceivedNotification(InterfaceElement notifier);
}
