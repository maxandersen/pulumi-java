// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionInputResponse {
    /**
     * The (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    private final @Nullable String dataType;
    /**
     * A flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     * 
     */
    private final @Nullable Boolean isConfigurationParameter;

    @CustomType.Constructor
    private FunctionInputResponse(
        @CustomType.Parameter("dataType") @Nullable String dataType,
        @CustomType.Parameter("isConfigurationParameter") @Nullable Boolean isConfigurationParameter) {
        this.dataType = dataType;
        this.isConfigurationParameter = isConfigurationParameter;
    }

    /**
     * The (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
    */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * A flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     * 
    */
    public Optional<Boolean> isConfigurationParameter() {
        return Optional.ofNullable(this.isConfigurationParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable Boolean isConfigurationParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.isConfigurationParameter = defaults.isConfigurationParameter;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder isConfigurationParameter(@Nullable Boolean isConfigurationParameter) {
            this.isConfigurationParameter = isConfigurationParameter;
            return this;
        }        public FunctionInputResponse build() {
            return new FunctionInputResponse(dataType, isConfigurationParameter);
        }
    }
}
