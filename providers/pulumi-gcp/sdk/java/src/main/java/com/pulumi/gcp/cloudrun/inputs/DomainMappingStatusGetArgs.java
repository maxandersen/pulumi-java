// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionGetArgs;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingStatusGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingStatusGetArgs Empty = new DomainMappingStatusGetArgs();

    @Import(name="conditions")
    private @Nullable Output<List<DomainMappingStatusConditionGetArgs>> conditions;

    public Optional<Output<List<DomainMappingStatusConditionGetArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    @Import(name="mappedRouteName")
    private @Nullable Output<String> mappedRouteName;

    public Optional<Output<String>> mappedRouteName() {
        return Optional.ofNullable(this.mappedRouteName);
    }

    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    @Import(name="resourceRecords")
    private @Nullable Output<List<DomainMappingStatusResourceRecordGetArgs>> resourceRecords;

    public Optional<Output<List<DomainMappingStatusResourceRecordGetArgs>>> resourceRecords() {
        return Optional.ofNullable(this.resourceRecords);
    }

    private DomainMappingStatusGetArgs() {}

    private DomainMappingStatusGetArgs(DomainMappingStatusGetArgs $) {
        this.conditions = $.conditions;
        this.mappedRouteName = $.mappedRouteName;
        this.observedGeneration = $.observedGeneration;
        this.resourceRecords = $.resourceRecords;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingStatusGetArgs $;

        public Builder() {
            $ = new DomainMappingStatusGetArgs();
        }

        public Builder(DomainMappingStatusGetArgs defaults) {
            $ = new DomainMappingStatusGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<DomainMappingStatusConditionGetArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<DomainMappingStatusConditionGetArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(DomainMappingStatusConditionGetArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder mappedRouteName(@Nullable Output<String> mappedRouteName) {
            $.mappedRouteName = mappedRouteName;
            return this;
        }

        public Builder mappedRouteName(String mappedRouteName) {
            return mappedRouteName(Output.of(mappedRouteName));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public Builder resourceRecords(@Nullable Output<List<DomainMappingStatusResourceRecordGetArgs>> resourceRecords) {
            $.resourceRecords = resourceRecords;
            return this;
        }

        public Builder resourceRecords(List<DomainMappingStatusResourceRecordGetArgs> resourceRecords) {
            return resourceRecords(Output.of(resourceRecords));
        }

        public Builder resourceRecords(DomainMappingStatusResourceRecordGetArgs... resourceRecords) {
            return resourceRecords(List.of(resourceRecords));
        }

        public DomainMappingStatusGetArgs build() {
            return $;
        }
    }

}
