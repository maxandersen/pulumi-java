// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckGrpcHealthCheckGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttp2HealthCheckGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpHealthCheckGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckHttpsHealthCheckGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckLogConfigGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckSslHealthCheckGetArgs;
import com.pulumi.gcp.compute.inputs.RegionHealthCheckTcpHealthCheckGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionHealthCheckState extends com.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckState Empty = new RegionHealthCheckState();

    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @Import(name="checkIntervalSec")
    private @Nullable Output<Integer> checkIntervalSec;

    public Optional<Output<Integer>> checkIntervalSec() {
        return Optional.ofNullable(this.checkIntervalSec);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="grpcHealthCheck")
    private @Nullable Output<RegionHealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck;

    public Optional<Output<RegionHealthCheckGrpcHealthCheckGetArgs>> grpcHealthCheck() {
        return Optional.ofNullable(this.grpcHealthCheck);
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="http2HealthCheck")
    private @Nullable Output<RegionHealthCheckHttp2HealthCheckGetArgs> http2HealthCheck;

    public Optional<Output<RegionHealthCheckHttp2HealthCheckGetArgs>> http2HealthCheck() {
        return Optional.ofNullable(this.http2HealthCheck);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="httpHealthCheck")
    private @Nullable Output<RegionHealthCheckHttpHealthCheckGetArgs> httpHealthCheck;

    public Optional<Output<RegionHealthCheckHttpHealthCheckGetArgs>> httpHealthCheck() {
        return Optional.ofNullable(this.httpHealthCheck);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="httpsHealthCheck")
    private @Nullable Output<RegionHealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck;

    public Optional<Output<RegionHealthCheckHttpsHealthCheckGetArgs>> httpsHealthCheck() {
        return Optional.ofNullable(this.httpsHealthCheck);
    }

    /**
     * Configure logging on this health check.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<RegionHealthCheckLogConfigGetArgs> logConfig;

    public Optional<Output<RegionHealthCheckLogConfigGetArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The Region in which the created health check should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="sslHealthCheck")
    private @Nullable Output<RegionHealthCheckSslHealthCheckGetArgs> sslHealthCheck;

    public Optional<Output<RegionHealthCheckSslHealthCheckGetArgs>> sslHealthCheck() {
        return Optional.ofNullable(this.sslHealthCheck);
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="tcpHealthCheck")
    private @Nullable Output<RegionHealthCheckTcpHealthCheckGetArgs> tcpHealthCheck;

    public Optional<Output<RegionHealthCheckTcpHealthCheckGetArgs>> tcpHealthCheck() {
        return Optional.ofNullable(this.tcpHealthCheck);
    }

    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
    private @Nullable Output<Integer> timeoutSec;

    public Optional<Output<Integer>> timeoutSec() {
        return Optional.ofNullable(this.timeoutSec);
    }

    /**
     * The type of the health check. One of HTTP, HTTP2, HTTPS, TCP, or SSL.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private RegionHealthCheckState() {}

    private RegionHealthCheckState(RegionHealthCheckState $) {
        this.checkIntervalSec = $.checkIntervalSec;
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.grpcHealthCheck = $.grpcHealthCheck;
        this.healthyThreshold = $.healthyThreshold;
        this.http2HealthCheck = $.http2HealthCheck;
        this.httpHealthCheck = $.httpHealthCheck;
        this.httpsHealthCheck = $.httpsHealthCheck;
        this.logConfig = $.logConfig;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.selfLink = $.selfLink;
        this.sslHealthCheck = $.sslHealthCheck;
        this.tcpHealthCheck = $.tcpHealthCheck;
        this.timeoutSec = $.timeoutSec;
        this.type = $.type;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionHealthCheckState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionHealthCheckState $;

        public Builder() {
            $ = new RegionHealthCheckState();
        }

        public Builder(RegionHealthCheckState defaults) {
            $ = new RegionHealthCheckState(Objects.requireNonNull(defaults));
        }

        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            $.checkIntervalSec = checkIntervalSec;
            return this;
        }

        public Builder checkIntervalSec(Integer checkIntervalSec) {
            return checkIntervalSec(Output.of(checkIntervalSec));
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder grpcHealthCheck(@Nullable Output<RegionHealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck) {
            $.grpcHealthCheck = grpcHealthCheck;
            return this;
        }

        public Builder grpcHealthCheck(RegionHealthCheckGrpcHealthCheckGetArgs grpcHealthCheck) {
            return grpcHealthCheck(Output.of(grpcHealthCheck));
        }

        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        public Builder http2HealthCheck(@Nullable Output<RegionHealthCheckHttp2HealthCheckGetArgs> http2HealthCheck) {
            $.http2HealthCheck = http2HealthCheck;
            return this;
        }

        public Builder http2HealthCheck(RegionHealthCheckHttp2HealthCheckGetArgs http2HealthCheck) {
            return http2HealthCheck(Output.of(http2HealthCheck));
        }

        public Builder httpHealthCheck(@Nullable Output<RegionHealthCheckHttpHealthCheckGetArgs> httpHealthCheck) {
            $.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder httpHealthCheck(RegionHealthCheckHttpHealthCheckGetArgs httpHealthCheck) {
            return httpHealthCheck(Output.of(httpHealthCheck));
        }

        public Builder httpsHealthCheck(@Nullable Output<RegionHealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck) {
            $.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder httpsHealthCheck(RegionHealthCheckHttpsHealthCheckGetArgs httpsHealthCheck) {
            return httpsHealthCheck(Output.of(httpsHealthCheck));
        }

        public Builder logConfig(@Nullable Output<RegionHealthCheckLogConfigGetArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(RegionHealthCheckLogConfigGetArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public Builder sslHealthCheck(@Nullable Output<RegionHealthCheckSslHealthCheckGetArgs> sslHealthCheck) {
            $.sslHealthCheck = sslHealthCheck;
            return this;
        }

        public Builder sslHealthCheck(RegionHealthCheckSslHealthCheckGetArgs sslHealthCheck) {
            return sslHealthCheck(Output.of(sslHealthCheck));
        }

        public Builder tcpHealthCheck(@Nullable Output<RegionHealthCheckTcpHealthCheckGetArgs> tcpHealthCheck) {
            $.tcpHealthCheck = tcpHealthCheck;
            return this;
        }

        public Builder tcpHealthCheck(RegionHealthCheckTcpHealthCheckGetArgs tcpHealthCheck) {
            return tcpHealthCheck(Output.of(tcpHealthCheck));
        }

        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            $.timeoutSec = timeoutSec;
            return this;
        }

        public Builder timeoutSec(Integer timeoutSec) {
            return timeoutSec(Output.of(timeoutSec));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public RegionHealthCheckState build() {
            return $;
        }
    }

}
