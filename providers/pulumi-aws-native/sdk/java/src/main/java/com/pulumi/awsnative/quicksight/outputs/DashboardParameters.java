// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.outputs.DashboardDateTimeParameter;
import com.pulumi.awsnative.quicksight.outputs.DashboardDecimalParameter;
import com.pulumi.awsnative.quicksight.outputs.DashboardIntegerParameter;
import com.pulumi.awsnative.quicksight.outputs.DashboardStringParameter;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DashboardParameters {
    /**
     * &lt;p&gt;Date-time parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DashboardDateTimeParameter> dateTimeParameters;
    /**
     * &lt;p&gt;Decimal parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DashboardDecimalParameter> decimalParameters;
    /**
     * &lt;p&gt;Integer parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DashboardIntegerParameter> integerParameters;
    /**
     * &lt;p&gt;String parameters.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DashboardStringParameter> stringParameters;

    @CustomType.Constructor
    private DashboardParameters(
        @CustomType.Parameter("dateTimeParameters") @Nullable List<DashboardDateTimeParameter> dateTimeParameters,
        @CustomType.Parameter("decimalParameters") @Nullable List<DashboardDecimalParameter> decimalParameters,
        @CustomType.Parameter("integerParameters") @Nullable List<DashboardIntegerParameter> integerParameters,
        @CustomType.Parameter("stringParameters") @Nullable List<DashboardStringParameter> stringParameters) {
        this.dateTimeParameters = dateTimeParameters;
        this.decimalParameters = decimalParameters;
        this.integerParameters = integerParameters;
        this.stringParameters = stringParameters;
    }

    /**
     * &lt;p&gt;Date-time parameters.&lt;/p&gt;
     * 
    */
    public List<DashboardDateTimeParameter> dateTimeParameters() {
        return this.dateTimeParameters == null ? List.of() : this.dateTimeParameters;
    }
    /**
     * &lt;p&gt;Decimal parameters.&lt;/p&gt;
     * 
    */
    public List<DashboardDecimalParameter> decimalParameters() {
        return this.decimalParameters == null ? List.of() : this.decimalParameters;
    }
    /**
     * &lt;p&gt;Integer parameters.&lt;/p&gt;
     * 
    */
    public List<DashboardIntegerParameter> integerParameters() {
        return this.integerParameters == null ? List.of() : this.integerParameters;
    }
    /**
     * &lt;p&gt;String parameters.&lt;/p&gt;
     * 
    */
    public List<DashboardStringParameter> stringParameters() {
        return this.stringParameters == null ? List.of() : this.stringParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DashboardDateTimeParameter> dateTimeParameters;
        private @Nullable List<DashboardDecimalParameter> decimalParameters;
        private @Nullable List<DashboardIntegerParameter> integerParameters;
        private @Nullable List<DashboardStringParameter> stringParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateTimeParameters = defaults.dateTimeParameters;
    	      this.decimalParameters = defaults.decimalParameters;
    	      this.integerParameters = defaults.integerParameters;
    	      this.stringParameters = defaults.stringParameters;
        }

        public Builder dateTimeParameters(@Nullable List<DashboardDateTimeParameter> dateTimeParameters) {
            this.dateTimeParameters = dateTimeParameters;
            return this;
        }
        public Builder dateTimeParameters(DashboardDateTimeParameter... dateTimeParameters) {
            return dateTimeParameters(List.of(dateTimeParameters));
        }
        public Builder decimalParameters(@Nullable List<DashboardDecimalParameter> decimalParameters) {
            this.decimalParameters = decimalParameters;
            return this;
        }
        public Builder decimalParameters(DashboardDecimalParameter... decimalParameters) {
            return decimalParameters(List.of(decimalParameters));
        }
        public Builder integerParameters(@Nullable List<DashboardIntegerParameter> integerParameters) {
            this.integerParameters = integerParameters;
            return this;
        }
        public Builder integerParameters(DashboardIntegerParameter... integerParameters) {
            return integerParameters(List.of(integerParameters));
        }
        public Builder stringParameters(@Nullable List<DashboardStringParameter> stringParameters) {
            this.stringParameters = stringParameters;
            return this;
        }
        public Builder stringParameters(DashboardStringParameter... stringParameters) {
            return stringParameters(List.of(stringParameters));
        }        public DashboardParameters build() {
            return new DashboardParameters(dateTimeParameters, decimalParameters, integerParameters, stringParameters);
        }
    }
}
