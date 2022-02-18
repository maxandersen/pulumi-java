// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ListMetaArgs;
import io.pulumi.kubernetes.meta_v1.inputs.StatusDetailsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusArgs Empty = new StatusArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Suggested HTTP return code for this status, 0 if not set.
     * 
     */
    @InputImport(name="code")
    private final @Nullable Input<Integer> code;

    public Input<Integer> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
     * 
     */
    @InputImport(name="details")
    private final @Nullable Input<StatusDetailsArgs> details;

    public Input<StatusDetailsArgs> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * A human-readable description of the status of this operation.
     * 
     */
    @InputImport(name="message")
    private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<ListMetaArgs> metadata;

    public Input<ListMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * A machine-readable description of why this operation is in the "Failure" status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
     * 
     */
    @InputImport(name="reason")
    private final @Nullable Input<String> reason;

    public Input<String> getReason() {
        return this.reason == null ? Input.empty() : this.reason;
    }

    public StatusArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<Integer> code,
        @Nullable Input<StatusDetailsArgs> details,
        @Nullable Input<String> kind,
        @Nullable Input<String> message,
        @Nullable Input<ListMetaArgs> metadata,
        @Nullable Input<String> reason) {
        this.apiVersion = apiVersion;
        this.code = code;
        this.details = details;
        this.kind = kind;
        this.message = message;
        this.metadata = metadata;
        this.reason = reason;
    }

    private StatusArgs() {
        this.apiVersion = Input.empty();
        this.code = Input.empty();
        this.details = Input.empty();
        this.kind = Input.empty();
        this.message = Input.empty();
        this.metadata = Input.empty();
        this.reason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<Integer> code;
        private @Nullable Input<StatusDetailsArgs> details;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> message;
        private @Nullable Input<ListMetaArgs> metadata;
        private @Nullable Input<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
    	      this.metadata = defaults.metadata;
    	      this.reason = defaults.reason;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setCode(@Nullable Input<Integer> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable Integer code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDetails(@Nullable Input<StatusDetailsArgs> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable StatusDetailsArgs details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ListMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ListMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setReason(@Nullable Input<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = Input.ofNullable(reason);
            return this;
        }

        public StatusArgs build() {
            return new StatusArgs(apiVersion, code, details, kind, message, metadata, reason);
        }
    }
}
