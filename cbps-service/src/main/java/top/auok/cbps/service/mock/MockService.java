package top.auok.cbps.service.mock;

import top.auok.cbps.model.Mock;
import top.auok.cbps.service.mock.exception.InvalidMockException;

public interface MockService {

	Mock createMock(Mock mock) throws InvalidMockException;

}
