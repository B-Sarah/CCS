package ccs.archi.interfaces;

import ccsM2.InterfaceElement;

public interface IObservable {
	void SetObserver(IObserver anObserver);
	void NotifyObserver(InterfaceElement elementChanged);
}
