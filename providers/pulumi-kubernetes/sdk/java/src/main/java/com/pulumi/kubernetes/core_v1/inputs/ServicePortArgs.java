// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ServicePort contains information on service&#39;s port.
 * 
 */
public final class ServicePortArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePortArgs Empty = new ServicePortArgs();

    /**
     * The application protocol for this port. This field follows standard Kubernetes label syntax. Un-prefixed names are reserved for IANA standard service names (as per RFC-6335 and http://www.iana.org/assignments/service-names). Non-standard protocols should use prefixed names such as mycompany.com/my-custom-protocol.
     * 
     */
    @Import(name="appProtocol")
    private @Nullable Output<String> appProtocol;

    public Optional<Output<String>> appProtocol() {
        return Optional.ofNullable(this.appProtocol);
    }

    /**
     * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined on this service.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port on each node on which this service is exposed when type is NodePort or LoadBalancer.  Usually assigned by the system. If a value is specified, in-range, and not in use it will be used, otherwise the operation will fail.  If not specified, a port will be allocated if this Service requires one.  If this field is specified when creating a Service which does not need it, creation will fail. This field will be wiped when updating a Service to no longer need it (e.g. changing type from NodePort to ClusterIP). More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
     * 
     */
    @Import(name="nodePort")
    private @Nullable Output<Integer> nodePort;

    public Optional<Output<Integer>> nodePort() {
        return Optional.ofNullable(this.nodePort);
    }

    /**
     * The port that will be exposed by this service.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The IP protocol for this port. Supports &#34;TCP&#34;, &#34;UDP&#34;, and &#34;SCTP&#34;. Default is TCP.
     * 
     * Possible enum values:
     *  - `&#34;SCTP&#34;` is the SCTP protocol.
     *  - `&#34;TCP&#34;` is the TCP protocol.
     *  - `&#34;UDP&#34;` is the UDP protocol.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;port&#39; field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the &#39;port&#39; field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
     * 
     */
    @Import(name="targetPort")
    private @Nullable Output<Either<Integer,String>> targetPort;

    public Optional<Output<Either<Integer,String>>> targetPort() {
        return Optional.ofNullable(this.targetPort);
    }

    private ServicePortArgs() {}

    private ServicePortArgs(ServicePortArgs $) {
        this.appProtocol = $.appProtocol;
        this.name = $.name;
        this.nodePort = $.nodePort;
        this.port = $.port;
        this.protocol = $.protocol;
        this.targetPort = $.targetPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePortArgs $;

        public Builder() {
            $ = new ServicePortArgs();
        }

        public Builder(ServicePortArgs defaults) {
            $ = new ServicePortArgs(Objects.requireNonNull(defaults));
        }

        public Builder appProtocol(@Nullable Output<String> appProtocol) {
            $.appProtocol = appProtocol;
            return this;
        }

        public Builder appProtocol(String appProtocol) {
            return appProtocol(Output.of(appProtocol));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder nodePort(@Nullable Output<Integer> nodePort) {
            $.nodePort = nodePort;
            return this;
        }

        public Builder nodePort(Integer nodePort) {
            return nodePort(Output.of(nodePort));
        }

        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder targetPort(@Nullable Output<Either<Integer,String>> targetPort) {
            $.targetPort = targetPort;
            return this;
        }

        public Builder targetPort(Either<Integer,String> targetPort) {
            return targetPort(Output.of(targetPort));
        }

        public ServicePortArgs build() {
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
