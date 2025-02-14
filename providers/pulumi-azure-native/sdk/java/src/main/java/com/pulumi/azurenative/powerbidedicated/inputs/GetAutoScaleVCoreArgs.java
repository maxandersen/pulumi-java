// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbidedicated.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutoScaleVCoreArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoScaleVCoreArgs Empty = new GetAutoScaleVCoreArgs();

    /**
     * The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="vcoreName", required=true)
    private String vcoreName;

    /**
     * @return The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public String vcoreName() {
        return this.vcoreName;
    }

    private GetAutoScaleVCoreArgs() {}

    private GetAutoScaleVCoreArgs(GetAutoScaleVCoreArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vcoreName = $.vcoreName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoScaleVCoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoScaleVCoreArgs $;

        public Builder() {
            $ = new GetAutoScaleVCoreArgs();
        }

        public Builder(GetAutoScaleVCoreArgs defaults) {
            $ = new GetAutoScaleVCoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vcoreName The name of the auto scale v-core. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder vcoreName(String vcoreName) {
            $.vcoreName = vcoreName;
            return this;
        }

        public GetAutoScaleVCoreArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vcoreName = Objects.requireNonNull($.vcoreName, "expected parameter 'vcoreName' to be non-null");
            return $;
        }
    }

}
