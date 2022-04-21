// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * VMwareV2 fabric specific details.
 * 
 */
public final class VMwareV2FabricSpecificDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMwareV2FabricSpecificDetailsResponse Empty = new VMwareV2FabricSpecificDetailsResponse();

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;VMwareV2&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
    private String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The Migration solution ARM Id.
     * 
     */
    @Import(name="migrationSolutionId", required=true)
    private String migrationSolutionId;

    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * The service endpoint.
     * 
     */
    @Import(name="serviceEndpoint", required=true)
    private String serviceEndpoint;

    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * The service resource Id.
     * 
     */
    @Import(name="serviceResourceId", required=true)
    private String serviceResourceId;

    public String serviceResourceId() {
        return this.serviceResourceId;
    }

    /**
     * The ARM Id of the VMware site.
     * 
     */
    @Import(name="vmwareSiteId", required=true)
    private String vmwareSiteId;

    public String vmwareSiteId() {
        return this.vmwareSiteId;
    }

    private VMwareV2FabricSpecificDetailsResponse() {}

    private VMwareV2FabricSpecificDetailsResponse(VMwareV2FabricSpecificDetailsResponse $) {
        this.instanceType = $.instanceType;
        this.migrationSolutionId = $.migrationSolutionId;
        this.serviceEndpoint = $.serviceEndpoint;
        this.serviceResourceId = $.serviceResourceId;
        this.vmwareSiteId = $.vmwareSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareV2FabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareV2FabricSpecificDetailsResponse $;

        public Builder() {
            $ = new VMwareV2FabricSpecificDetailsResponse();
        }

        public Builder(VMwareV2FabricSpecificDetailsResponse defaults) {
            $ = new VMwareV2FabricSpecificDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder migrationSolutionId(String migrationSolutionId) {
            $.migrationSolutionId = migrationSolutionId;
            return this;
        }

        public Builder serviceEndpoint(String serviceEndpoint) {
            $.serviceEndpoint = serviceEndpoint;
            return this;
        }

        public Builder serviceResourceId(String serviceResourceId) {
            $.serviceResourceId = serviceResourceId;
            return this;
        }

        public Builder vmwareSiteId(String vmwareSiteId) {
            $.vmwareSiteId = vmwareSiteId;
            return this;
        }

        public VMwareV2FabricSpecificDetailsResponse build() {
            $.instanceType = Codegen.stringProp("instanceType").arg($.instanceType).require();
            $.migrationSolutionId = Objects.requireNonNull($.migrationSolutionId, "expected parameter 'migrationSolutionId' to be non-null");
            $.serviceEndpoint = Objects.requireNonNull($.serviceEndpoint, "expected parameter 'serviceEndpoint' to be non-null");
            $.serviceResourceId = Objects.requireNonNull($.serviceResourceId, "expected parameter 'serviceResourceId' to be non-null");
            $.vmwareSiteId = Objects.requireNonNull($.vmwareSiteId, "expected parameter 'vmwareSiteId' to be non-null");
            return $;
        }
    }

}
