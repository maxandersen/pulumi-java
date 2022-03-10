// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.TypedLocalObjectReference;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressBackend {
    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
     */
    private final @Nullable TypedLocalObjectReference resource;
    /**
     * Specifies the name of the referenced service.
     * 
     */
    private final String serviceName;
    /**
     * Specifies the port of the referenced service.
     * 
     */
    private final Either<Integer,String> servicePort;

    @OutputCustomType.Constructor
    private IngressBackend(
        @OutputCustomType.Parameter("resource") @Nullable TypedLocalObjectReference resource,
        @OutputCustomType.Parameter("serviceName") String serviceName,
        @OutputCustomType.Parameter("servicePort") Either<Integer,String> servicePort) {
        this.resource = resource;
        this.serviceName = serviceName;
        this.servicePort = servicePort;
    }

    /**
     * Resource is an ObjectRef to another Kubernetes resource in the namespace of the Ingress object. If resource is specified, serviceName and servicePort must not be specified.
     * 
    */
    public Optional<TypedLocalObjectReference> getResource() {
        return Optional.ofNullable(this.resource);
    }
    /**
     * Specifies the name of the referenced service.
     * 
    */
    public String getServiceName() {
        return this.serviceName;
    }
    /**
     * Specifies the port of the referenced service.
     * 
    */
    public Either<Integer,String> getServicePort() {
        return this.servicePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressBackend defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TypedLocalObjectReference resource;
        private String serviceName;
        private Either<Integer,String> servicePort;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressBackend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
    	      this.serviceName = defaults.serviceName;
    	      this.servicePort = defaults.servicePort;
        }

        public Builder setResource(@Nullable TypedLocalObjectReference resource) {
            this.resource = resource;
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServicePort(Either<Integer,String> servicePort) {
            this.servicePort = Objects.requireNonNull(servicePort);
            return this;
        }
        public IngressBackend build() {
            return new IngressBackend(resource, serviceName, servicePort);
        }
    }
}
