// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single parameter to optimize.
 * 
 */
public final class GoogleCloudMlV1_StudyConfig_ParameterSpecResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfig_ParameterSpecResponse Empty = new GoogleCloudMlV1_StudyConfig_ParameterSpecResponse();

    /**
     * The value spec for a 'CATEGORICAL' parameter.
     * 
     */
    @Import(name="categoricalValueSpec", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse categoricalValueSpec;

    public GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse categoricalValueSpec() {
        return this.categoricalValueSpec;
    }

    /**
     * A child node is active if the parameter's value matches the child node's matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
     * 
     */
    @Import(name="childParameterSpecs", required=true)
      private final List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> childParameterSpecs;

    public List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> childParameterSpecs() {
        return this.childParameterSpecs;
    }

    /**
     * The value spec for a 'DISCRETE' parameter.
     * 
     */
    @Import(name="discreteValueSpec", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse discreteValueSpec;

    public GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse discreteValueSpec() {
        return this.discreteValueSpec;
    }

    /**
     * The value spec for a 'DOUBLE' parameter.
     * 
     */
    @Import(name="doubleValueSpec", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse doubleValueSpec;

    public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse doubleValueSpec() {
        return this.doubleValueSpec;
    }

    /**
     * The value spec for an 'INTEGER' parameter.
     * 
     */
    @Import(name="integerValueSpec", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse integerValueSpec;

    public GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse integerValueSpec() {
        return this.integerValueSpec;
    }

    /**
     * The parameter name must be unique amongst all ParameterSpecs.
     * 
     */
    @Import(name="parameter", required=true)
      private final String parameter;

    public String parameter() {
        return this.parameter;
    }

    @Import(name="parentCategoricalValues", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse parentCategoricalValues;

    public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse parentCategoricalValues() {
        return this.parentCategoricalValues;
    }

    @Import(name="parentDiscreteValues", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse parentDiscreteValues;

    public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse parentDiscreteValues() {
        return this.parentDiscreteValues;
    }

    @Import(name="parentIntValues", required=true)
      private final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse parentIntValues;

    public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse parentIntValues() {
        return this.parentIntValues;
    }

    /**
     * How the parameter should be scaled. Leave unset for categorical parameters.
     * 
     */
    @Import(name="scaleType", required=true)
      private final String scaleType;

    public String scaleType() {
        return this.scaleType;
    }

    /**
     * The type of the parameter.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GoogleCloudMlV1_StudyConfig_ParameterSpecResponse(
        GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse categoricalValueSpec,
        List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> childParameterSpecs,
        GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse discreteValueSpec,
        GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse doubleValueSpec,
        GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse integerValueSpec,
        String parameter,
        GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse parentCategoricalValues,
        GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse parentDiscreteValues,
        GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse parentIntValues,
        String scaleType,
        String type) {
        this.categoricalValueSpec = Objects.requireNonNull(categoricalValueSpec, "expected parameter 'categoricalValueSpec' to be non-null");
        this.childParameterSpecs = Objects.requireNonNull(childParameterSpecs, "expected parameter 'childParameterSpecs' to be non-null");
        this.discreteValueSpec = Objects.requireNonNull(discreteValueSpec, "expected parameter 'discreteValueSpec' to be non-null");
        this.doubleValueSpec = Objects.requireNonNull(doubleValueSpec, "expected parameter 'doubleValueSpec' to be non-null");
        this.integerValueSpec = Objects.requireNonNull(integerValueSpec, "expected parameter 'integerValueSpec' to be non-null");
        this.parameter = Objects.requireNonNull(parameter, "expected parameter 'parameter' to be non-null");
        this.parentCategoricalValues = Objects.requireNonNull(parentCategoricalValues, "expected parameter 'parentCategoricalValues' to be non-null");
        this.parentDiscreteValues = Objects.requireNonNull(parentDiscreteValues, "expected parameter 'parentDiscreteValues' to be non-null");
        this.parentIntValues = Objects.requireNonNull(parentIntValues, "expected parameter 'parentIntValues' to be non-null");
        this.scaleType = Objects.requireNonNull(scaleType, "expected parameter 'scaleType' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfig_ParameterSpecResponse() {
        this.categoricalValueSpec = null;
        this.childParameterSpecs = List.of();
        this.discreteValueSpec = null;
        this.doubleValueSpec = null;
        this.integerValueSpec = null;
        this.parameter = null;
        this.parentCategoricalValues = null;
        this.parentDiscreteValues = null;
        this.parentIntValues = null;
        this.scaleType = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfig_ParameterSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse categoricalValueSpec;
        private List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> childParameterSpecs;
        private GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse discreteValueSpec;
        private GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse doubleValueSpec;
        private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse integerValueSpec;
        private String parameter;
        private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse parentCategoricalValues;
        private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse parentDiscreteValues;
        private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse parentIntValues;
        private String scaleType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfig_ParameterSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalValueSpec = defaults.categoricalValueSpec;
    	      this.childParameterSpecs = defaults.childParameterSpecs;
    	      this.discreteValueSpec = defaults.discreteValueSpec;
    	      this.doubleValueSpec = defaults.doubleValueSpec;
    	      this.integerValueSpec = defaults.integerValueSpec;
    	      this.parameter = defaults.parameter;
    	      this.parentCategoricalValues = defaults.parentCategoricalValues;
    	      this.parentDiscreteValues = defaults.parentDiscreteValues;
    	      this.parentIntValues = defaults.parentIntValues;
    	      this.scaleType = defaults.scaleType;
    	      this.type = defaults.type;
        }

        public Builder categoricalValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecResponse categoricalValueSpec) {
            this.categoricalValueSpec = Objects.requireNonNull(categoricalValueSpec);
            return this;
        }
        public Builder childParameterSpecs(List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> childParameterSpecs) {
            this.childParameterSpecs = Objects.requireNonNull(childParameterSpecs);
            return this;
        }
        public Builder childParameterSpecs(GoogleCloudMlV1_StudyConfig_ParameterSpecResponse... childParameterSpecs) {
            return childParameterSpecs(List.of(childParameterSpecs));
        }
        public Builder discreteValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse discreteValueSpec) {
            this.discreteValueSpec = Objects.requireNonNull(discreteValueSpec);
            return this;
        }
        public Builder doubleValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse doubleValueSpec) {
            this.doubleValueSpec = Objects.requireNonNull(doubleValueSpec);
            return this;
        }
        public Builder integerValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse integerValueSpec) {
            this.integerValueSpec = Objects.requireNonNull(integerValueSpec);
            return this;
        }
        public Builder parameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }
        public Builder parentCategoricalValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecResponse parentCategoricalValues) {
            this.parentCategoricalValues = Objects.requireNonNull(parentCategoricalValues);
            return this;
        }
        public Builder parentDiscreteValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecResponse parentDiscreteValues) {
            this.parentDiscreteValues = Objects.requireNonNull(parentDiscreteValues);
            return this;
        }
        public Builder parentIntValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse parentIntValues) {
            this.parentIntValues = Objects.requireNonNull(parentIntValues);
            return this;
        }
        public Builder scaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudMlV1_StudyConfig_ParameterSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfig_ParameterSpecResponse(categoricalValueSpec, childParameterSpecs, discreteValueSpec, doubleValueSpec, integerValueSpec, parameter, parentCategoricalValues, parentDiscreteValues, parentIntValues, scaleType, type);
        }
    }
}
