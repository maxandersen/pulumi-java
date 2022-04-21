// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppInstanceFunctionSlotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppInstanceFunctionSlotArgs Empty = new GetWebAppInstanceFunctionSlotArgs();

    /**
     * Function name.
     * 
     */
    @Import(name="functionName", required=true)
    private String functionName;

    public String functionName() {
        return this.functionName;
    }

    /**
     * Site name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    public String slot() {
        return this.slot;
    }

    private GetWebAppInstanceFunctionSlotArgs() {}

    private GetWebAppInstanceFunctionSlotArgs(GetWebAppInstanceFunctionSlotArgs $) {
        this.functionName = $.functionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppInstanceFunctionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppInstanceFunctionSlotArgs $;

        public Builder() {
            $ = new GetWebAppInstanceFunctionSlotArgs();
        }

        public Builder(GetWebAppInstanceFunctionSlotArgs defaults) {
            $ = new GetWebAppInstanceFunctionSlotArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public GetWebAppInstanceFunctionSlotArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
