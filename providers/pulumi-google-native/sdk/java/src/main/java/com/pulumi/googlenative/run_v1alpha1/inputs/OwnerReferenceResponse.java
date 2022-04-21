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
    private String apiVersion;

    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * If true, AND if the owner has the &#34;foregroundDeletion&#34; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs &#34;delete&#34; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned. +optional
     * 
     */
    @Import(name="blockOwnerDeletion", required=true)
    private Boolean blockOwnerDeletion;

    public Boolean blockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    /**
     * If true, this reference points to the managing controller. +optional
     * 
     */
    @Import(name="controller", required=true)
    private Boolean controller;

    public Boolean controller() {
        return this.controller;
    }

    /**
     * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid", required=true)
    private String uid;

    public String uid() {
        return this.uid;
    }

    private OwnerReferenceResponse() {}

    private OwnerReferenceResponse(OwnerReferenceResponse $) {
        this.apiVersion = $.apiVersion;
        this.blockOwnerDeletion = $.blockOwnerDeletion;
        this.controller = $.controller;
        this.kind = $.kind;
        this.name = $.name;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OwnerReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OwnerReferenceResponse $;

        public Builder() {
            $ = new OwnerReferenceResponse();
        }

        public Builder(OwnerReferenceResponse defaults) {
            $ = new OwnerReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(String apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder blockOwnerDeletion(Boolean blockOwnerDeletion) {
            $.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        public Builder controller(Boolean controller) {
            $.controller = controller;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        public OwnerReferenceResponse build() {
            $.apiVersion = Objects.requireNonNull($.apiVersion, "expected parameter 'apiVersion' to be non-null");
            $.blockOwnerDeletion = Objects.requireNonNull($.blockOwnerDeletion, "expected parameter 'blockOwnerDeletion' to be non-null");
            $.controller = Objects.requireNonNull($.controller, "expected parameter 'controller' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            return $;
        }
    }

}
