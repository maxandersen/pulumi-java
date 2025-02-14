// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPackageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPackageArgs Empty = new GetPackageArgs();

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
    private String packageName;

    /**
     * @return The resource name of the Test Base Package.
     * 
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
    private String testBaseAccountName;

    /**
     * @return The resource name of the Test Base Account.
     * 
     */
    public String testBaseAccountName() {
        return this.testBaseAccountName;
    }

    private GetPackageArgs() {}

    private GetPackageArgs(GetPackageArgs $) {
        this.packageName = $.packageName;
        this.resourceGroupName = $.resourceGroupName;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPackageArgs $;

        public Builder() {
            $ = new GetPackageArgs();
        }

        public Builder(GetPackageArgs defaults) {
            $ = new GetPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packageName The resource name of the Test Base Package.
         * 
         * @return builder
         * 
         */
        public Builder packageName(String packageName) {
            $.packageName = packageName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(String testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        public GetPackageArgs build() {
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.testBaseAccountName = Objects.requireNonNull($.testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
            return $;
        }
    }

}
