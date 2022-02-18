// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 * 
 */
public final class ServiceReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceReferenceArgs Empty = new ServiceReferenceArgs();

    /**
     * Name is the name of the service
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Namespace is the namespace of the service
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ServiceReferenceArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> namespace,
        @Nullable Input<Integer> port) {
        this.name = name;
        this.namespace = namespace;
        this.port = port;
    }

    private ServiceReferenceArgs() {
        this.name = Input.empty();
        this.namespace = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> namespace;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.port = defaults.port;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public ServiceReferenceArgs build() {
            return new ServiceReferenceArgs(name, namespace, port);
        }
    }
}
