// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement.inputs;

import com.pulumi.azurenative.alertsmanagement.inputs.HealthStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the health alert criteria to alert on.
 * 
 */
public final class VmGuestHealthAlertCriterionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmGuestHealthAlertCriterionArgs Empty = new VmGuestHealthAlertCriterionArgs();

    /**
     * Health states to alert on
     * 
     */
    @Import(name="healthStates", required=true)
      private final Output<List<HealthStateArgs>> healthStates;

    public Output<List<HealthStateArgs>> healthStates() {
        return this.healthStates;
    }

    /**
     * Names of health monitor on which to define alert
     * 
     */
    @Import(name="monitorNames")
      private final @Nullable Output<List<String>> monitorNames;

    public Output<List<String>> monitorNames() {
        return this.monitorNames == null ? Codegen.empty() : this.monitorNames;
    }

    /**
     * Names of health monitor type on which to define alert
     * 
     */
    @Import(name="monitorTypes")
      private final @Nullable Output<List<String>> monitorTypes;

    public Output<List<String>> monitorTypes() {
        return this.monitorTypes == null ? Codegen.empty() : this.monitorTypes;
    }

    /**
     * specifies the type of the alert criterion.
     * Expected value is &#39;GuestVmHealth&#39;.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    public VmGuestHealthAlertCriterionArgs(
        Output<List<HealthStateArgs>> healthStates,
        @Nullable Output<List<String>> monitorNames,
        @Nullable Output<List<String>> monitorTypes,
        Output<String> namespace) {
        this.healthStates = Objects.requireNonNull(healthStates, "expected parameter 'healthStates' to be non-null");
        this.monitorNames = monitorNames;
        this.monitorTypes = monitorTypes;
        this.namespace = Codegen.stringProp("namespace").output().arg(namespace).require();
    }

    private VmGuestHealthAlertCriterionArgs() {
        this.healthStates = Codegen.empty();
        this.monitorNames = Codegen.empty();
        this.monitorTypes = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmGuestHealthAlertCriterionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<HealthStateArgs>> healthStates;
        private @Nullable Output<List<String>> monitorNames;
        private @Nullable Output<List<String>> monitorTypes;
        private Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(VmGuestHealthAlertCriterionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthStates = defaults.healthStates;
    	      this.monitorNames = defaults.monitorNames;
    	      this.monitorTypes = defaults.monitorTypes;
    	      this.namespace = defaults.namespace;
        }

        public Builder healthStates(Output<List<HealthStateArgs>> healthStates) {
            this.healthStates = Objects.requireNonNull(healthStates);
            return this;
        }
        public Builder healthStates(List<HealthStateArgs> healthStates) {
            this.healthStates = Output.of(Objects.requireNonNull(healthStates));
            return this;
        }
        public Builder healthStates(HealthStateArgs... healthStates) {
            return healthStates(List.of(healthStates));
        }
        public Builder monitorNames(@Nullable Output<List<String>> monitorNames) {
            this.monitorNames = monitorNames;
            return this;
        }
        public Builder monitorNames(@Nullable List<String> monitorNames) {
            this.monitorNames = Codegen.ofNullable(monitorNames);
            return this;
        }
        public Builder monitorNames(String... monitorNames) {
            return monitorNames(List.of(monitorNames));
        }
        public Builder monitorTypes(@Nullable Output<List<String>> monitorTypes) {
            this.monitorTypes = monitorTypes;
            return this;
        }
        public Builder monitorTypes(@Nullable List<String> monitorTypes) {
            this.monitorTypes = Codegen.ofNullable(monitorTypes);
            return this;
        }
        public Builder monitorTypes(String... monitorTypes) {
            return monitorTypes(List.of(monitorTypes));
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }        public VmGuestHealthAlertCriterionArgs build() {
            return new VmGuestHealthAlertCriterionArgs(healthStates, monitorNames, monitorTypes, namespace);
        }
    }
}
