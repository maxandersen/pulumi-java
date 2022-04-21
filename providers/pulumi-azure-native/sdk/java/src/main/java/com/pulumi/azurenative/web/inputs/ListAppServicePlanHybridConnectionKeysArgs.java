// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAppServicePlanHybridConnectionKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListAppServicePlanHybridConnectionKeysArgs Empty = new ListAppServicePlanHybridConnectionKeysArgs();

    /**
     * Name of the App Service plan.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The name of the Service Bus relay.
     * 
     */
    @Import(name="relayName", required=true)
    private String relayName;

    public String relayName() {
        return this.relayName;
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

    private ListAppServicePlanHybridConnectionKeysArgs() {}

    private ListAppServicePlanHybridConnectionKeysArgs(ListAppServicePlanHybridConnectionKeysArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAppServicePlanHybridConnectionKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAppServicePlanHybridConnectionKeysArgs $;

        public Builder() {
            $ = new ListAppServicePlanHybridConnectionKeysArgs();
        }

        public Builder(ListAppServicePlanHybridConnectionKeysArgs defaults) {
            $ = new ListAppServicePlanHybridConnectionKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder relayName(String relayName) {
            $.relayName = relayName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListAppServicePlanHybridConnectionKeysArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.relayName = Objects.requireNonNull($.relayName, "expected parameter 'relayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
