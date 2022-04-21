// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProtectionIntentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProtectionIntentArgs Empty = new GetProtectionIntentArgs();

    /**
     * Fabric name associated with the backed up item.
     * 
     */
    @Import(name="fabricName", required=true)
    private String fabricName;

    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Backed up item name whose details are to be fetched.
     * 
     */
    @Import(name="intentObjectName", required=true)
    private String intentObjectName;

    public String intentObjectName() {
        return this.intentObjectName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
    private String vaultName;

    public String vaultName() {
        return this.vaultName;
    }

    private GetProtectionIntentArgs() {}

    private GetProtectionIntentArgs(GetProtectionIntentArgs $) {
        this.fabricName = $.fabricName;
        this.intentObjectName = $.intentObjectName;
        this.resourceGroupName = $.resourceGroupName;
        this.vaultName = $.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProtectionIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProtectionIntentArgs $;

        public Builder() {
            $ = new GetProtectionIntentArgs();
        }

        public Builder(GetProtectionIntentArgs defaults) {
            $ = new GetProtectionIntentArgs(Objects.requireNonNull(defaults));
        }

        public Builder fabricName(String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        public Builder intentObjectName(String intentObjectName) {
            $.intentObjectName = intentObjectName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder vaultName(String vaultName) {
            $.vaultName = vaultName;
            return this;
        }

        public GetProtectionIntentArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.intentObjectName = Objects.requireNonNull($.intentObjectName, "expected parameter 'intentObjectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vaultName = Objects.requireNonNull($.vaultName, "expected parameter 'vaultName' to be non-null");
            return $;
        }
    }

}
