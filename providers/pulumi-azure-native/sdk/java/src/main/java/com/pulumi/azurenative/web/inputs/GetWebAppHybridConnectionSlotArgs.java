// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppHybridConnectionSlotArgs extends InvokeArgs {

    public static final GetWebAppHybridConnectionSlotArgs Empty = new GetWebAppHybridConnectionSlotArgs();

    /**
     * The name of the web app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the web app.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The namespace for this hybrid connection.
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The namespace for this hybrid connection.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The relay name for this hybrid connection.
     * 
     */
    @Import(name="relayName", required=true)
    private String relayName;

    /**
     * @return The relay name for this hybrid connection.
     * 
     */
    public String relayName() {
        return this.relayName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the slot for the web app.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    /**
     * @return The name of the slot for the web app.
     * 
     */
    public String slot() {
        return this.slot;
    }

    private GetWebAppHybridConnectionSlotArgs() {}

    private GetWebAppHybridConnectionSlotArgs(GetWebAppHybridConnectionSlotArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.relayName = $.relayName;
        this.resourceGroupName = $.resourceGroupName;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppHybridConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppHybridConnectionSlotArgs $;

        public Builder() {
            $ = new GetWebAppHybridConnectionSlotArgs();
        }

        public Builder(GetWebAppHybridConnectionSlotArgs defaults) {
            $ = new GetWebAppHybridConnectionSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the web app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceName The namespace for this hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param relayName The relay name for this hybrid connection.
         * 
         * @return builder
         * 
         */
        public Builder relayName(String relayName) {
            $.relayName = relayName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param slot The name of the slot for the web app.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public GetWebAppHybridConnectionSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.relayName = Objects.requireNonNull($.relayName, "expected parameter 'relayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
