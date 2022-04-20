// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.azurenative.signalrservice.enums.FeatureFlags;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Feature of a SignalR resource, which controls the SignalR runtime behavior.
 * 
 */
public final class SignalRFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final SignalRFeatureArgs Empty = new SignalRFeatureArgs();

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: &#34;Default&#34;: have your own backend server; &#34;Serverless&#34;: your application doesn&#39;t have a backend server; &#34;Classic&#34;: for backward compatibility. Support both Default and Serverless mode but not recommended; &#34;PredefinedOnly&#34;: for future use.
     * - EnableConnectivityLogs: &#34;true&#34;/&#34;false&#34;, to enable/disable the connectivity log category respectively.
     * 
     */
    @Import(name="flag", required=true)
      private final Output<Either<String,FeatureFlags>> flag;

    public Output<Either<String,FeatureFlags>> flag() {
        return this.flag;
    }

    /**
     * Optional properties related to this feature.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public SignalRFeatureArgs(
        Output<Either<String,FeatureFlags>> flag,
        @Nullable Output<Map<String,String>> properties,
        Output<String> value) {
        this.flag = Objects.requireNonNull(flag, "expected parameter 'flag' to be non-null");
        this.properties = properties;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SignalRFeatureArgs() {
        this.flag = Codegen.empty();
        this.properties = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,FeatureFlags>> flag;
        private @Nullable Output<Map<String,String>> properties;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder flag(Output<Either<String,FeatureFlags>> flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }
        public Builder flag(Either<String,FeatureFlags> flag) {
            this.flag = Output.of(Objects.requireNonNull(flag));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public SignalRFeatureArgs build() {
            return new SignalRFeatureArgs(flag, properties, value);
        }
    }
}
