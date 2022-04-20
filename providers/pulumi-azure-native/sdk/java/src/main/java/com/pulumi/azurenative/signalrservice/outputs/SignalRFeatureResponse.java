// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SignalRFeatureResponse {
    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: &#34;Default&#34;: have your own backend server; &#34;Serverless&#34;: your application doesn&#39;t have a backend server; &#34;Classic&#34;: for backward compatibility. Support both Default and Serverless mode but not recommended; &#34;PredefinedOnly&#34;: for future use.
     * - EnableConnectivityLogs: &#34;true&#34;/&#34;false&#34;, to enable/disable the connectivity log category respectively.
     * 
     */
    private final String flag;
    /**
     * Optional properties related to this feature.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SignalRFeatureResponse(
        @CustomType.Parameter("flag") String flag,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("value") String value) {
        this.flag = flag;
        this.properties = properties;
        this.value = value;
    }

    /**
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values allowed: &#34;Default&#34;: have your own backend server; &#34;Serverless&#34;: your application doesn&#39;t have a backend server; &#34;Classic&#34;: for backward compatibility. Support both Default and Serverless mode but not recommended; &#34;PredefinedOnly&#34;: for future use.
     * - EnableConnectivityLogs: &#34;true&#34;/&#34;false&#34;, to enable/disable the connectivity log category respectively.
     * 
    */
    public String flag() {
        return this.flag;
    }
    /**
     * Optional properties related to this feature.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Value of the feature flag. See Azure SignalR service document https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignalRFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flag;
        private @Nullable Map<String,String> properties;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SignalRFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder flag(String flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SignalRFeatureResponse build() {
            return new SignalRFeatureResponse(flag, properties, value);
        }
    }
}
