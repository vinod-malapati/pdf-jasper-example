package com.generate.invoice.service;

import com.generate.invoice.model.OrderEntryModel;
import com.generate.invoice.model.OrderModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockOrderService {


    public OrderModel details(String from, String to) {
        return new OrderModel(from, to, 2000 , entries());
    }

    private List<OrderEntryModel> entries() {
        return new ArrayList<OrderEntryModel>() {
            {
                add(new OrderEntryModel("Apple IPhone X", 1, 500d));
            }
        };
    }
}
