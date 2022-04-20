// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.meta_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 * 
 */
public final class ListMetaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListMetaArgs Empty = new ListMetaArgs();

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    @Import(name="continue")
      private final @Nullable Output<String> continue_;

    public Output<String> continue_() {
        return this.continue_ == null ? Codegen.empty() : this.continue_;
    }

    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    @Import(name="remainingItemCount")
      private final @Nullable Output<Integer> remainingItemCount;

    public Output<Integer> remainingItemCount() {
        return this.remainingItemCount == null ? Codegen.empty() : this.remainingItemCount;
    }

    /**
     * String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @Import(name="resourceVersion")
      private final @Nullable Output<String> resourceVersion;

    public Output<String> resourceVersion() {
        return this.resourceVersion == null ? Codegen.empty() : this.resourceVersion;
    }

    /**
     * selfLink is a URL representing this object. Populated by the system. Read-only.
     * 
     * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> selfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    public ListMetaArgs(
        @Nullable Output<String> continue_,
        @Nullable Output<Integer> remainingItemCount,
        @Nullable Output<String> resourceVersion,
        @Nullable Output<String> selfLink) {
        this.continue_ = continue_;
        this.remainingItemCount = remainingItemCount;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    private ListMetaArgs() {
        this.continue_ = Codegen.empty();
        this.remainingItemCount = Codegen.empty();
        this.resourceVersion = Codegen.empty();
        this.selfLink = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMetaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> continue_;
        private @Nullable Output<Integer> remainingItemCount;
        private @Nullable Output<String> resourceVersion;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMetaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continue_ = defaults.continue_;
    	      this.remainingItemCount = defaults.remainingItemCount;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder continue_(@Nullable Output<String> continue_) {
            this.continue_ = continue_;
            return this;
        }
        public Builder continue_(@Nullable String continue_) {
            this.continue_ = Codegen.ofNullable(continue_);
            return this;
        }
        public Builder remainingItemCount(@Nullable Output<Integer> remainingItemCount) {
            this.remainingItemCount = remainingItemCount;
            return this;
        }
        public Builder remainingItemCount(@Nullable Integer remainingItemCount) {
            this.remainingItemCount = Codegen.ofNullable(remainingItemCount);
            return this;
        }
        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Codegen.ofNullable(resourceVersion);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }        public ListMetaArgs build() {
            return new ListMetaArgs(continue_, remainingItemCount, resourceVersion, selfLink);
        }
    }
}
