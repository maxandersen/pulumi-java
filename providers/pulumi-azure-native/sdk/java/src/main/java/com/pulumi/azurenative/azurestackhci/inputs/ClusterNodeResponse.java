// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Cluster node details.
 * 
 */
public final class ClusterNodeResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterNodeResponse Empty = new ClusterNodeResponse();

    /**
     * Number of physical cores on the cluster node.
     * 
     */
    @Import(name="coreCount", required=true)
    private Double coreCount;

    public Double coreCount() {
        return this.coreCount;
    }

    /**
     * Id of the node in the cluster.
     * 
     */
    @Import(name="id", required=true)
    private Double id;

    public Double id() {
        return this.id;
    }

    /**
     * Manufacturer of the cluster node hardware.
     * 
     */
    @Import(name="manufacturer", required=true)
    private String manufacturer;

    public String manufacturer() {
        return this.manufacturer;
    }

    /**
     * Total available memory on the cluster node (in GiB).
     * 
     */
    @Import(name="memoryInGiB", required=true)
    private Double memoryInGiB;

    public Double memoryInGiB() {
        return this.memoryInGiB;
    }

    /**
     * Model name of the cluster node hardware.
     * 
     */
    @Import(name="model", required=true)
    private String model;

    public String model() {
        return this.model;
    }

    /**
     * Name of the cluster node.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Operating system running on the cluster node.
     * 
     */
    @Import(name="osName", required=true)
    private String osName;

    public String osName() {
        return this.osName;
    }

    /**
     * Version of the operating system running on the cluster node.
     * 
     */
    @Import(name="osVersion", required=true)
    private String osVersion;

    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Immutable id of the cluster node.
     * 
     */
    @Import(name="serialNumber", required=true)
    private String serialNumber;

    public String serialNumber() {
        return this.serialNumber;
    }

    private ClusterNodeResponse() {}

    private ClusterNodeResponse(ClusterNodeResponse $) {
        this.coreCount = $.coreCount;
        this.id = $.id;
        this.manufacturer = $.manufacturer;
        this.memoryInGiB = $.memoryInGiB;
        this.model = $.model;
        this.name = $.name;
        this.osName = $.osName;
        this.osVersion = $.osVersion;
        this.serialNumber = $.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeResponse $;

        public Builder() {
            $ = new ClusterNodeResponse();
        }

        public Builder(ClusterNodeResponse defaults) {
            $ = new ClusterNodeResponse(Objects.requireNonNull(defaults));
        }

        public Builder coreCount(Double coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        public Builder id(Double id) {
            $.id = id;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            $.manufacturer = manufacturer;
            return this;
        }

        public Builder memoryInGiB(Double memoryInGiB) {
            $.memoryInGiB = memoryInGiB;
            return this;
        }

        public Builder model(String model) {
            $.model = model;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder osName(String osName) {
            $.osName = osName;
            return this;
        }

        public Builder osVersion(String osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        public ClusterNodeResponse build() {
            $.coreCount = Objects.requireNonNull($.coreCount, "expected parameter 'coreCount' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.manufacturer = Objects.requireNonNull($.manufacturer, "expected parameter 'manufacturer' to be non-null");
            $.memoryInGiB = Objects.requireNonNull($.memoryInGiB, "expected parameter 'memoryInGiB' to be non-null");
            $.model = Objects.requireNonNull($.model, "expected parameter 'model' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.osName = Objects.requireNonNull($.osName, "expected parameter 'osName' to be non-null");
            $.osVersion = Objects.requireNonNull($.osVersion, "expected parameter 'osVersion' to be non-null");
            $.serialNumber = Objects.requireNonNull($.serialNumber, "expected parameter 'serialNumber' to be non-null");
            return $;
        }
    }

}
