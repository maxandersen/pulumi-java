// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Istio service scoped to an Istio mesh. Anthos clusters running ASM < 1.6.8 will have their services ingested as this type.
 * 
 */
public final class MeshIstioResponse extends com.pulumi.resources.InvokeArgs {

    public static final MeshIstioResponse Empty = new MeshIstioResponse();

    /**
     * Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics.
     * 
     */
    @Import(name="meshUid", required=true)
      private final String meshUid;

    public String meshUid() {
        return this.meshUid;
    }

    /**
     * The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    /**
     * The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics.
     * 
     */
    @Import(name="serviceNamespace", required=true)
      private final String serviceNamespace;

    public String serviceNamespace() {
        return this.serviceNamespace;
    }

    public MeshIstioResponse(
        String meshUid,
        String serviceName,
        String serviceNamespace) {
        this.meshUid = Objects.requireNonNull(meshUid, "expected parameter 'meshUid' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
    }

    private MeshIstioResponse() {
        this.meshUid = null;
        this.serviceName = null;
        this.serviceNamespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshIstioResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String meshUid;
        private String serviceName;
        private String serviceNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshIstioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.meshUid = defaults.meshUid;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceNamespace = defaults.serviceNamespace;
        }

        public Builder meshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }        public MeshIstioResponse build() {
            return new MeshIstioResponse(meshUid, serviceName, serviceNamespace);
        }
    }
}
