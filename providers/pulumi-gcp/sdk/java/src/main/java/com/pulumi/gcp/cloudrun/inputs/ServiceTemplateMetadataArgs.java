// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateMetadataArgs Empty = new ServiceTemplateMetadataArgs();

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
    @Import(name="annotations")
    private @Nullable Output<Map<String,String>> annotations;

    public Optional<Output<Map<String,String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * - 
     * A sequence number representing a specific generation of the desired state.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<Integer> generation;

    public Optional<Output<Integer>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Volume&#39;s name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    public Optional<Output<String>> namespace() {
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
    @Import(name="resourceVersion")
    private @Nullable Output<String> resourceVersion;

    public Optional<Output<String>> resourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }

    /**
     * - 
     * SelfLink is a URL representing this object.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * - 
     * UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private ServiceTemplateMetadataArgs() {}

    private ServiceTemplateMetadataArgs(ServiceTemplateMetadataArgs $) {
        this.annotations = $.annotations;
        this.generation = $.generation;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.resourceVersion = $.resourceVersion;
        this.selfLink = $.selfLink;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateMetadataArgs $;

        public Builder() {
            $ = new ServiceTemplateMetadataArgs();
        }

        public Builder(ServiceTemplateMetadataArgs defaults) {
            $ = new ServiceTemplateMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Map<String,String> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder generation(@Nullable Output<Integer> generation) {
            $.generation = generation;
            return this;
        }

        public Builder generation(Integer generation) {
            return generation(Output.of(generation));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            $.resourceVersion = resourceVersion;
            return this;
        }

        public Builder resourceVersion(String resourceVersion) {
            return resourceVersion(Output.of(resourceVersion));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public ServiceTemplateMetadataArgs build() {
            return $;
        }
    }

}
