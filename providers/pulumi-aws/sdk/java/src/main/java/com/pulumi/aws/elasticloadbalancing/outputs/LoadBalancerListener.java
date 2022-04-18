// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerListener {
    /**
     * The port on the instance to route to
     * 
     */
    private final Integer instancePort;
    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    private final String instanceProtocol;
    /**
     * The port to listen on for the load balancer
     * 
     */
    private final Integer lbPort;
    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    private final String lbProtocol;
    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    private final @Nullable String sslCertificateId;

    @CustomType.Constructor
    private LoadBalancerListener(
        @CustomType.Parameter("instancePort") Integer instancePort,
        @CustomType.Parameter("instanceProtocol") String instanceProtocol,
        @CustomType.Parameter("lbPort") Integer lbPort,
        @CustomType.Parameter("lbProtocol") String lbProtocol,
        @CustomType.Parameter("sslCertificateId") @Nullable String sslCertificateId) {
        this.instancePort = instancePort;
        this.instanceProtocol = instanceProtocol;
        this.lbPort = lbPort;
        this.lbProtocol = lbProtocol;
        this.sslCertificateId = sslCertificateId;
    }

    /**
     * The port on the instance to route to
     * 
    */
    public Integer instancePort() {
        return this.instancePort;
    }
    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
    */
    public String instanceProtocol() {
        return this.instanceProtocol;
    }
    /**
     * The port to listen on for the load balancer
     * 
    */
    public Integer lbPort() {
        return this.lbPort;
    }
    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
    */
    public String lbProtocol() {
        return this.lbProtocol;
    }
    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
    */
    public Optional<String> sslCertificateId() {
        return Optional.ofNullable(this.sslCertificateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instancePort;
        private String instanceProtocol;
        private Integer lbPort;
        private String lbProtocol;
        private @Nullable String sslCertificateId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.instanceProtocol = defaults.instanceProtocol;
    	      this.lbPort = defaults.lbPort;
    	      this.lbProtocol = defaults.lbProtocol;
    	      this.sslCertificateId = defaults.sslCertificateId;
        }

        public Builder instancePort(Integer instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }
        public Builder instanceProtocol(String instanceProtocol) {
            this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
            return this;
        }
        public Builder lbPort(Integer lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }
        public Builder lbProtocol(String lbProtocol) {
            this.lbProtocol = Objects.requireNonNull(lbProtocol);
            return this;
        }
        public Builder sslCertificateId(@Nullable String sslCertificateId) {
            this.sslCertificateId = sslCertificateId;
            return this;
        }        public LoadBalancerListener build() {
            return new LoadBalancerListener(instancePort, instanceProtocol, lbPort, lbProtocol, sslCertificateId);
        }
    }
}
