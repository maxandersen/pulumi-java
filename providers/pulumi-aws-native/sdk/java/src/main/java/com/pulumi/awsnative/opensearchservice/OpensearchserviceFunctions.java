// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.opensearchservice.inputs.GetDomainArgs;
import com.pulumi.awsnative.opensearchservice.outputs.GetDomainResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OpensearchserviceFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:opensearchservice:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
}
