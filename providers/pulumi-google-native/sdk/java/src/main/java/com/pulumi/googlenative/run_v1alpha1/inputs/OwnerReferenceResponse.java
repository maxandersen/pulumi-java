// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * OwnerReference contains enough information to let you identify an owning object. Currently, an owning object must be in the same namespace, so there is no namespace field.
 * 
 */
public final class OwnerReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OwnerReferenceResponse Empty = new OwnerReferenceResponse();

    /**
     * API version of the referent.
     * 
     */
    @Import(name="apiVersion", required=true)
      private final String apiVersion;

    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    @Import(name="blockOwnerDeletion", required=true)
      private final Boolean blockOwnerDeletion;

    public Boolean blockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    /**
     * If true, this reference points to the managing controller. +optional
     * 
     */
    @Import(name="controller", required=true)
      private final Boolean controller;

    public Boolean controller() {
        return this.controller;
    }

    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid", required=true)
      private final String uid;

    public String uid() {
        return this.uid;
    }

    public OwnerReferenceResponse(
        String apiVersion,
        Boolean blockOwnerDeletion,
        Boolean controller,
        String kind,
        String name,
        String uid) {
        this.apiVersion = Objects.requireNonNull(apiVersion, "expected parameter 'apiVersion' to be non-null");
        this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion, "expected parameter 'blockOwnerDeletion' to be non-null");
        this.controller = Objects.requireNonNull(controller, "expected parameter 'controller' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
    }

    private OwnerReferenceResponse() {
        this.apiVersion = null;
        this.blockOwnerDeletion = null;
        this.controller = null;
        this.kind = null;
        this.name = null;
        this.uid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private Boolean blockOwnerDeletion;
        private Boolean controller;
        private String kind;
        private String name;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OwnerReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder blockOwnerDeletion(Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
            return this;
        }
        public Builder controller(Boolean controller) {
            this.controller = Objects.requireNonNull(controller);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public OwnerReferenceResponse build() {
            return new OwnerReferenceResponse(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
        }
    }
}
