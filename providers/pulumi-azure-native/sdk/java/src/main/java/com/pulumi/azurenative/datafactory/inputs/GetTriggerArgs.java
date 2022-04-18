// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
      private final String factoryName;

    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
      private final String triggerName;

    public String triggerName() {
        return this.triggerName;
    }

    public GetTriggerArgs(
        String factoryName,
        String resourceGroupName,
        String triggerName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
    }

    private GetTriggerArgs() {
        this.factoryName = null;
        this.resourceGroupName = null;
        this.triggerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String factoryName;
        private String resourceGroupName;
        private String triggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggerName = defaults.triggerName;
        }

        public Builder factoryName(String factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder triggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }        public GetTriggerArgs build() {
            return new GetTriggerArgs(factoryName, resourceGroupName, triggerName);
        }
    }
}
