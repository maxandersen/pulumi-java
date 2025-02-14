// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointClientConnectOptions {
    /**
     * @return Indicates whether connection logging is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * 
     */
    private final @Nullable String lambdaFunctionArn;

    @CustomType.Constructor
    private EndpointClientConnectOptions(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("lambdaFunctionArn") @Nullable String lambdaFunctionArn) {
        this.enabled = enabled;
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * @return Indicates whether connection logging is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function used for connection authorization.
     * 
     */
    public Optional<String> lambdaFunctionArn() {
        return Optional.ofNullable(this.lambdaFunctionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointClientConnectOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String lambdaFunctionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointClientConnectOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.lambdaFunctionArn = defaults.lambdaFunctionArn;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder lambdaFunctionArn(@Nullable String lambdaFunctionArn) {
            this.lambdaFunctionArn = lambdaFunctionArn;
            return this;
        }        public EndpointClientConnectOptions build() {
            return new EndpointClientConnectOptions(enabled, lambdaFunctionArn);
        }
    }
}
