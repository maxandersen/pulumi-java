// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_alpha.HealthCheckArgs;
import com.pulumi.googlenative.compute_alpha.outputs.GRPCHealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.HTTP2HealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.HTTPHealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.HTTPSHealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.HealthCheckLogConfigResponse;
import com.pulumi.googlenative.compute_alpha.outputs.SSLHealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.TCPHealthCheckResponse;
import com.pulumi.googlenative.compute_alpha.outputs.UDPHealthCheckResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a HealthCheck resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:HealthCheck")
public class HealthCheck extends com.pulumi.resources.CustomResource {
    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Export(name="checkIntervalSec", type=Integer.class, parameters={})
    private Output<Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    public Output<Integer> checkIntervalSec() {
        return this.checkIntervalSec;
    }
    /**
     * Creation timestamp in 3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in 3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    @Export(name="grpcHealthCheck", type=GRPCHealthCheckResponse.class, parameters={})
    private Output<GRPCHealthCheckResponse> grpcHealthCheck;

    public Output<GRPCHealthCheckResponse> grpcHealthCheck() {
        return this.grpcHealthCheck;
    }
    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Export(name="healthyThreshold", type=Integer.class, parameters={})
    private Output<Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    public Output<Integer> healthyThreshold() {
        return this.healthyThreshold;
    }
    @Export(name="http2HealthCheck", type=HTTP2HealthCheckResponse.class, parameters={})
    private Output<HTTP2HealthCheckResponse> http2HealthCheck;

    public Output<HTTP2HealthCheckResponse> http2HealthCheck() {
        return this.http2HealthCheck;
    }
    @Export(name="httpHealthCheck", type=HTTPHealthCheckResponse.class, parameters={})
    private Output<HTTPHealthCheckResponse> httpHealthCheck;

    public Output<HTTPHealthCheckResponse> httpHealthCheck() {
        return this.httpHealthCheck;
    }
    @Export(name="httpsHealthCheck", type=HTTPSHealthCheckResponse.class, parameters={})
    private Output<HTTPSHealthCheckResponse> httpsHealthCheck;

    public Output<HTTPSHealthCheckResponse> httpsHealthCheck() {
        return this.httpsHealthCheck;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Configure logging on this health check.
     * 
     */
    @Export(name="logConfig", type=HealthCheckLogConfigResponse.class, parameters={})
    private Output<HealthCheckLogConfigResponse> logConfig;

    /**
     * @return Configure logging on this health check.
     * 
     */
    public Output<HealthCheckLogConfigResponse> logConfig() {
        return this.logConfig;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn&#39;t a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Region where the health check resides. Not applicable to global health checks.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the health check resides. Not applicable to global health checks.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    @Export(name="sslHealthCheck", type=SSLHealthCheckResponse.class, parameters={})
    private Output<SSLHealthCheckResponse> sslHealthCheck;

    public Output<SSLHealthCheckResponse> sslHealthCheck() {
        return this.sslHealthCheck;
    }
    @Export(name="tcpHealthCheck", type=TCPHealthCheckResponse.class, parameters={})
    private Output<TCPHealthCheckResponse> tcpHealthCheck;

    public Output<TCPHealthCheckResponse> tcpHealthCheck() {
        return this.tcpHealthCheck;
    }
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Export(name="timeoutSec", type=Integer.class, parameters={})
    private Output<Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    public Output<Integer> timeoutSec() {
        return this.timeoutSec;
    }
    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="udpHealthCheck", type=UDPHealthCheckResponse.class, parameters={})
    private Output<UDPHealthCheckResponse> udpHealthCheck;

    public Output<UDPHealthCheckResponse> udpHealthCheck() {
        return this.udpHealthCheck;
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Export(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output<Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    public Output<Integer> unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HealthCheck(String name) {
        this(name, HealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HealthCheck(String name, @Nullable HealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HealthCheck(String name, @Nullable HealthCheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HealthCheck(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:HealthCheck", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HealthCheck get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, options);
    }
}
