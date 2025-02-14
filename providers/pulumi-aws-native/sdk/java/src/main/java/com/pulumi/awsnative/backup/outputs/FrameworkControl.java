// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.outputs;

import com.pulumi.awsnative.backup.outputs.FrameworkControlControlScopeProperties;
import com.pulumi.awsnative.backup.outputs.FrameworkControlInputParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrameworkControl {
    /**
     * @return A list of ParameterName and ParameterValue pairs.
     * 
     */
    private final @Nullable List<FrameworkControlInputParameter> controlInputParameters;
    /**
     * @return The name of a control. This name is between 1 and 256 characters.
     * 
     */
    private final String controlName;
    /**
     * @return The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    private final @Nullable FrameworkControlControlScopeProperties controlScope;

    @CustomType.Constructor
    private FrameworkControl(
        @CustomType.Parameter("controlInputParameters") @Nullable List<FrameworkControlInputParameter> controlInputParameters,
        @CustomType.Parameter("controlName") String controlName,
        @CustomType.Parameter("controlScope") @Nullable FrameworkControlControlScopeProperties controlScope) {
        this.controlInputParameters = controlInputParameters;
        this.controlName = controlName;
        this.controlScope = controlScope;
    }

    /**
     * @return A list of ParameterName and ParameterValue pairs.
     * 
     */
    public List<FrameworkControlInputParameter> controlInputParameters() {
        return this.controlInputParameters == null ? List.of() : this.controlInputParameters;
    }
    /**
     * @return The name of a control. This name is between 1 and 256 characters.
     * 
     */
    public String controlName() {
        return this.controlName;
    }
    /**
     * @return The scope of a control. The control scope defines what the control will evaluate. Three examples of control scopes are: a specific backup plan, all backup plans with a specific tag, or all backup plans.
     * 
     */
    public Optional<FrameworkControlControlScopeProperties> controlScope() {
        return Optional.ofNullable(this.controlScope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FrameworkControlInputParameter> controlInputParameters;
        private String controlName;
        private @Nullable FrameworkControlControlScopeProperties controlScope;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlInputParameters = defaults.controlInputParameters;
    	      this.controlName = defaults.controlName;
    	      this.controlScope = defaults.controlScope;
        }

        public Builder controlInputParameters(@Nullable List<FrameworkControlInputParameter> controlInputParameters) {
            this.controlInputParameters = controlInputParameters;
            return this;
        }
        public Builder controlInputParameters(FrameworkControlInputParameter... controlInputParameters) {
            return controlInputParameters(List.of(controlInputParameters));
        }
        public Builder controlName(String controlName) {
            this.controlName = Objects.requireNonNull(controlName);
            return this;
        }
        public Builder controlScope(@Nullable FrameworkControlControlScopeProperties controlScope) {
            this.controlScope = controlScope;
            return this;
        }        public FrameworkControl build() {
            return new FrameworkControl(controlInputParameters, controlName, controlScope);
        }
    }
}
