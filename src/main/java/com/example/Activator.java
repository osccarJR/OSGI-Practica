package com.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    @Override
    public void start(BundleContext context) throws Exception {
        context.registerService(AreaCalculator.class.getName(), new AreaCalculatorImpl(), null);
        System.out.println("AreaCalculator service registered");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("AreaCalculator service stopped");
    }
}
