// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagerExtendedInfoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagerExtendedInfoArgs Empty = new GetManagerExtendedInfoArgs();

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private String managerName;

    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagerExtendedInfoArgs() {}

    private GetManagerExtendedInfoArgs(GetManagerExtendedInfoArgs $) {
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagerExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagerExtendedInfoArgs $;

        public Builder() {
            $ = new GetManagerExtendedInfoArgs();
        }

        public Builder(GetManagerExtendedInfoArgs defaults) {
            $ = new GetManagerExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder managerName(String managerName) {
            $.managerName = managerName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagerExtendedInfoArgs build() {
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
