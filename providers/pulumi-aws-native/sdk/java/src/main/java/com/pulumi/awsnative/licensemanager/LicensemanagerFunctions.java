// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.licensemanager.inputs.GetGrantArgs;
import com.pulumi.awsnative.licensemanager.inputs.GetLicenseArgs;
import com.pulumi.awsnative.licensemanager.outputs.GetGrantResult;
import com.pulumi.awsnative.licensemanager.outputs.GetLicenseResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LicensemanagerFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetGrantResult> getGrant(GetGrantArgs args) {
        return getGrant(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetGrantResult> getGrant(GetGrantArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:licensemanager:getGrant", TypeShape.of(GetGrantResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::LicenseManager::License
     * 
     */
    public static CompletableFuture<GetLicenseResult> getLicense(GetLicenseArgs args) {
        return getLicense(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLicenseResult> getLicense(GetLicenseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:licensemanager:getLicense", TypeShape.of(GetLicenseResult.class), args, Utilities.withVersion(options));
    }
}
