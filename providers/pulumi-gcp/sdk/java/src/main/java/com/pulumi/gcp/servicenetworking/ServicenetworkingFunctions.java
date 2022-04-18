// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.servicenetworking;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.servicenetworking.inputs.GetPeeredDnsDomainArgs;
import com.pulumi.gcp.servicenetworking.outputs.GetPeeredDnsDomainResult;
import java.util.concurrent.CompletableFuture;

public final class ServicenetworkingFunctions {
    public static CompletableFuture<GetPeeredDnsDomainResult> getPeeredDnsDomain(GetPeeredDnsDomainArgs args) {
        return getPeeredDnsDomain(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPeeredDnsDomainResult> getPeeredDnsDomain(GetPeeredDnsDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:servicenetworking/getPeeredDnsDomain:getPeeredDnsDomain", TypeShape.of(GetPeeredDnsDomainResult.class), args, Utilities.withVersion(options));
    }
}
