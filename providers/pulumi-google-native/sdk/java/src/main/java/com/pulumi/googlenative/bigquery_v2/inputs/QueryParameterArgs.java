// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.QueryParameterValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueryParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueryParameterArgs Empty = new QueryParameterArgs();

    /**
     * [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * [Required] The type of this parameter.
     * 
     */
    @Import(name="parameterType")
    private @Nullable Output<QueryParameterTypeArgs> parameterType;

    public Optional<Output<QueryParameterTypeArgs>> parameterType() {
        return Optional.ofNullable(this.parameterType);
    }

    /**
     * [Required] The value of this parameter.
     * 
     */
    @Import(name="parameterValue")
    private @Nullable Output<QueryParameterValueArgs> parameterValue;

    public Optional<Output<QueryParameterValueArgs>> parameterValue() {
        return Optional.ofNullable(this.parameterValue);
    }

    private QueryParameterArgs() {}

    private QueryParameterArgs(QueryParameterArgs $) {
        this.name = $.name;
        this.parameterType = $.parameterType;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueryParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryParameterArgs $;

        public Builder() {
            $ = new QueryParameterArgs();
        }

        public Builder(QueryParameterArgs defaults) {
            $ = new QueryParameterArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder parameterType(@Nullable Output<QueryParameterTypeArgs> parameterType) {
            $.parameterType = parameterType;
            return this;
        }

        public Builder parameterType(QueryParameterTypeArgs parameterType) {
            return parameterType(Output.of(parameterType));
        }

        public Builder parameterValue(@Nullable Output<QueryParameterValueArgs> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        public Builder parameterValue(QueryParameterValueArgs parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public QueryParameterArgs build() {
            return $;
        }
    }

}
