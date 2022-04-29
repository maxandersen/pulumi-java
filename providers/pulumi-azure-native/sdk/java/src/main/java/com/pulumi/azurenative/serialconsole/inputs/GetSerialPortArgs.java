// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.serialconsole.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSerialPortArgs extends InvokeArgs {

    public static final GetSerialPortArgs Empty = new GetSerialPortArgs();

    /**
     * The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
     * 
     */
    @Import(name="parentResource", required=true)
    private String parentResource;

    /**
     * @return The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
     * 
     */
    public String parentResource() {
        return this.parentResource;
    }

    /**
     * The resource type of the parent resource.  For example: &#39;virtualMachines&#39; or &#39;virtualMachineScaleSets&#39;
     * 
     */
    @Import(name="parentResourceType", required=true)
    private String parentResourceType;

    /**
     * @return The resource type of the parent resource.  For example: &#39;virtualMachines&#39; or &#39;virtualMachineScaleSets&#39;
     * 
     */
    public String parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @Import(name="resourceProviderNamespace", required=true)
    private String resourceProviderNamespace;

    /**
     * @return The namespace of the resource provider.
     * 
     */
    public String resourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The name of the serial port to connect to.
     * 
     */
    @Import(name="serialPort", required=true)
    private String serialPort;

    /**
     * @return The name of the serial port to connect to.
     * 
     */
    public String serialPort() {
        return this.serialPort;
    }

    private GetSerialPortArgs() {}

    private GetSerialPortArgs(GetSerialPortArgs $) {
        this.parentResource = $.parentResource;
        this.parentResourceType = $.parentResourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceProviderNamespace = $.resourceProviderNamespace;
        this.serialPort = $.serialPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSerialPortArgs $;

        public Builder() {
            $ = new GetSerialPortArgs();
        }

        public Builder(GetSerialPortArgs defaults) {
            $ = new GetSerialPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parentResource The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder parentResource(String parentResource) {
            $.parentResource = parentResource;
            return this;
        }

        /**
         * @param parentResourceType The resource type of the parent resource.  For example: &#39;virtualMachines&#39; or &#39;virtualMachineScaleSets&#39;
         * 
         * @return builder
         * 
         */
        public Builder parentResourceType(String parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceProviderNamespace The namespace of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder resourceProviderNamespace(String resourceProviderNamespace) {
            $.resourceProviderNamespace = resourceProviderNamespace;
            return this;
        }

        /**
         * @param serialPort The name of the serial port to connect to.
         * 
         * @return builder
         * 
         */
        public Builder serialPort(String serialPort) {
            $.serialPort = serialPort;
            return this;
        }

        public GetSerialPortArgs build() {
            $.parentResource = Objects.requireNonNull($.parentResource, "expected parameter 'parentResource' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceProviderNamespace = Objects.requireNonNull($.resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
            $.serialPort = Objects.requireNonNull($.serialPort, "expected parameter 'serialPort' to be non-null");
            return $;
        }
    }

}
