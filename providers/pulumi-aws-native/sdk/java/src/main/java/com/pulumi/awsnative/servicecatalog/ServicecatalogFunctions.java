// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.servicecatalog;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.servicecatalog.inputs.GetCloudFormationProvisionedProductArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionArgs;
import com.pulumi.awsnative.servicecatalog.inputs.GetServiceActionAssociationArgs;
import com.pulumi.awsnative.servicecatalog.outputs.GetCloudFormationProvisionedProductResult;
import com.pulumi.awsnative.servicecatalog.outputs.GetServiceActionAssociationResult;
import com.pulumi.awsnative.servicecatalog.outputs.GetServiceActionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicecatalogFunctions {
    /**
     * Resource Schema for AWS::ServiceCatalog::CloudFormationProvisionedProduct
     * 
     */
    public static CompletableFuture<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProduct(GetCloudFormationProvisionedProductArgs args) {
        return getCloudFormationProvisionedProduct(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCloudFormationProvisionedProductResult> getCloudFormationProvisionedProduct(GetCloudFormationProvisionedProductArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getCloudFormationProvisionedProduct", TypeShape.of(GetCloudFormationProvisionedProductResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceAction
     * 
     */
    public static CompletableFuture<GetServiceActionResult> getServiceAction(GetServiceActionArgs args) {
        return getServiceAction(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceActionResult> getServiceAction(GetServiceActionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getServiceAction", TypeShape.of(GetServiceActionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema for AWS::ServiceCatalog::ServiceActionAssociation
     * 
     */
    public static CompletableFuture<GetServiceActionAssociationResult> getServiceActionAssociation(GetServiceActionAssociationArgs args) {
        return getServiceActionAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetServiceActionAssociationResult> getServiceActionAssociation(GetServiceActionAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:servicecatalog:getServiceActionAssociation", TypeShape.of(GetServiceActionAssociationResult.class), args, Utilities.withVersion(options));
    }
}
