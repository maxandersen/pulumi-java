// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes storage class info.
 * 
 */
public final class KubernetesRoleStorageClassInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleStorageClassInfoResponse Empty = new KubernetesRoleStorageClassInfoResponse();

    /**
     * Storage class name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * If provisioned storage is posix compliant.
     * 
     */
    @Import(name="posixCompliant", required=true)
      private final String posixCompliant;

    public String posixCompliant() {
        return this.posixCompliant;
    }

    /**
     * Storage class type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public KubernetesRoleStorageClassInfoResponse(
        String name,
        String posixCompliant,
        String type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.posixCompliant = Objects.requireNonNull(posixCompliant, "expected parameter 'posixCompliant' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private KubernetesRoleStorageClassInfoResponse() {
        this.name = null;
        this.posixCompliant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleStorageClassInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String posixCompliant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleStorageClassInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.posixCompliant = defaults.posixCompliant;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder posixCompliant(String posixCompliant) {
            this.posixCompliant = Objects.requireNonNull(posixCompliant);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public KubernetesRoleStorageClassInfoResponse build() {
            return new KubernetesRoleStorageClassInfoResponse(name, posixCompliant, type);
        }
    }
}
