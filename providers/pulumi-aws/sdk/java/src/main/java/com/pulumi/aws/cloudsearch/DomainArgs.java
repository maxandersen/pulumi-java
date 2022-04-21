// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch;

import com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Import(name="endpointOptions")
    private @Nullable Output<DomainEndpointOptionsArgs> endpointOptions;

    public Optional<Output<DomainEndpointOptionsArgs>> endpointOptions() {
        return Optional.ofNullable(this.endpointOptions);
    }

    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Import(name="indexFields")
    private @Nullable Output<List<DomainIndexFieldArgs>> indexFields;

    public Optional<Output<List<DomainIndexFieldArgs>>> indexFields() {
        return Optional.ofNullable(this.indexFields);
    }

    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Import(name="multiAz")
    private @Nullable Output<Boolean> multiAz;

    public Optional<Output<Boolean>> multiAz() {
        return Optional.ofNullable(this.multiAz);
    }

    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Import(name="scalingParameters")
    private @Nullable Output<DomainScalingParametersArgs> scalingParameters;

    public Optional<Output<DomainScalingParametersArgs>> scalingParameters() {
        return Optional.ofNullable(this.scalingParameters);
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.endpointOptions = $.endpointOptions;
        this.indexFields = $.indexFields;
        this.multiAz = $.multiAz;
        this.name = $.name;
        this.scalingParameters = $.scalingParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointOptions(@Nullable Output<DomainEndpointOptionsArgs> endpointOptions) {
            $.endpointOptions = endpointOptions;
            return this;
        }

        public Builder endpointOptions(DomainEndpointOptionsArgs endpointOptions) {
            return endpointOptions(Output.of(endpointOptions));
        }

        public Builder indexFields(@Nullable Output<List<DomainIndexFieldArgs>> indexFields) {
            $.indexFields = indexFields;
            return this;
        }

        public Builder indexFields(List<DomainIndexFieldArgs> indexFields) {
            return indexFields(Output.of(indexFields));
        }

        public Builder indexFields(DomainIndexFieldArgs... indexFields) {
            return indexFields(List.of(indexFields));
        }

        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            $.multiAz = multiAz;
            return this;
        }

        public Builder multiAz(Boolean multiAz) {
            return multiAz(Output.of(multiAz));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scalingParameters(@Nullable Output<DomainScalingParametersArgs> scalingParameters) {
            $.scalingParameters = scalingParameters;
            return this;
        }

        public Builder scalingParameters(DomainScalingParametersArgs scalingParameters) {
            return scalingParameters(Output.of(scalingParameters));
        }

        public DomainArgs build() {
            return $;
        }
    }

}
