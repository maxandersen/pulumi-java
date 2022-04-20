// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTemplateMetadata {
    /**
     * Annotations is a key value map stored with a resource that
     * may be set by external tools to store and retrieve arbitrary metadata. More
     * info: http://kubernetes.io/docs/user-guide/annotations
     * **Note**: The Cloud Run API may add additional annotations that were not provided in your config.
     * If the provider plan shows a diff where a server-side annotation is added, you can add it to your config
     * or apply the lifecycle.ignore_changes rule to the metadata.0.annotations field.
     * Cloud Run (fully managed) uses the following annotation keys to configure features on a Service:
     * - `run.googleapis.com/ingress` sets the [ingress settings](https://cloud.google.com/sdk/gcloud/reference/run/deploy#--ingress)
     *   for the Service. For example, `&#34;run.googleapis.com/ingress&#34; = &#34;all&#34;`.
     * 
     */
    private final @Nullable Map<String,String> annotations;
    /**
     * - 
     * A sequence number representing a specific generation of the desired state.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Volume&#39;s name.
     * 
     */
    private final @Nullable String name;
    /**
     * In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    private final @Nullable String namespace;
    /**
     * - 
     * An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private final @Nullable String resourceVersion;
    /**
     * - 
     * SelfLink is a URL representing this object.
     * 
     */
    private final @Nullable String selfLink;
    /**
     * - 
     * UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    private final @Nullable String uid;

    @CustomType.Constructor
    private ServiceTemplateMetadata(
        @CustomType.Parameter("annotations") @Nullable Map<String,String> annotations,
        @CustomType.Parameter("generation") @Nullable Integer generation,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("resourceVersion") @Nullable String resourceVersion,
        @CustomType.Parameter("selfLink") @Nullable String selfLink,
        @CustomType.Parameter("uid") @Nullable String uid) {
        this.annotations = annotations;
        this.generation = generation;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    /**
     * Annotations is a key value map stored with a resource that
     * may be set by external tools to store and retrieve arbitrary metadata. More
     * info: http://kubernetes.io/docs/user-guide/annotations
     * **Note**: The Cloud Run API may add additional annotations that were not provided in your config.
     * If the provider plan shows a diff where a server-side annotation is added, you can add it to your config
     * or apply the lifecycle.ignore_changes rule to the metadata.0.annotations field.
     * Cloud Run (fully managed) uses the following annotation keys to configure features on a Service:
     * - `run.googleapis.com/ingress` sets the [ingress settings](https://cloud.google.com/sdk/gcloud/reference/run/deploy#--ingress)
     *   for the Service. For example, `&#34;run.googleapis.com/ingress&#34; = &#34;all&#34;`.
     * 
    */
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    /**
     * - 
     * A sequence number representing a specific generation of the desired state.
     * 
    */
    public Optional<Integer> generation() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
    */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Volume&#39;s name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
    */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * - 
     * An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
    */
    public Optional<String> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * - 
     * SelfLink is a URL representing this object.
     * 
    */
    public Optional<String> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }
    /**
     * - 
     * UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
    */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable Integer generation;
        private @Nullable Map<String,String> labels;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;
        private @Nullable String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }        public ServiceTemplateMetadata build() {
            return new ServiceTemplateMetadata(annotations, generation, labels, name, namespace, resourceVersion, selfLink, uid);
        }
    }
}
