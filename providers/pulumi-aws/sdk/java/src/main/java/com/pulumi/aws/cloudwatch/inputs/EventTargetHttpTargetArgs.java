// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetHttpTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetHttpTargetArgs Empty = new EventTargetHttpTargetArgs();

    /**
     * Enables you to specify HTTP headers to add to the request.
     * 
     */
    @Import(name="headerParameters")
    private @Nullable Output<Map<String,String>> headerParameters;

    public Optional<Output<Map<String,String>>> headerParameters() {
        return Optional.ofNullable(this.headerParameters);
    }

    /**
     * The list of values that correspond sequentially to any path variables in your endpoint ARN (for example `arn:aws:execute-api:us-east-1:123456:myapi/*{@literal /}POST/pets/*`).
     * 
     */
    @Import(name="pathParameterValues")
    private @Nullable Output<List<String>> pathParameterValues;

    public Optional<Output<List<String>>> pathParameterValues() {
        return Optional.ofNullable(this.pathParameterValues);
    }

    /**
     * Represents keys/values of query string parameters that are appended to the invoked endpoint.
     * 
     */
    @Import(name="queryStringParameters")
    private @Nullable Output<Map<String,String>> queryStringParameters;

    public Optional<Output<Map<String,String>>> queryStringParameters() {
        return Optional.ofNullable(this.queryStringParameters);
    }

    private EventTargetHttpTargetArgs() {}

    private EventTargetHttpTargetArgs(EventTargetHttpTargetArgs $) {
        this.headerParameters = $.headerParameters;
        this.pathParameterValues = $.pathParameterValues;
        this.queryStringParameters = $.queryStringParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetHttpTargetArgs $;

        public Builder() {
            $ = new EventTargetHttpTargetArgs();
        }

        public Builder(EventTargetHttpTargetArgs defaults) {
            $ = new EventTargetHttpTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerParameters(@Nullable Output<Map<String,String>> headerParameters) {
            $.headerParameters = headerParameters;
            return this;
        }

        public Builder headerParameters(Map<String,String> headerParameters) {
            return headerParameters(Output.of(headerParameters));
        }

        public Builder pathParameterValues(@Nullable Output<List<String>> pathParameterValues) {
            $.pathParameterValues = pathParameterValues;
            return this;
        }

        public Builder pathParameterValues(List<String> pathParameterValues) {
            return pathParameterValues(Output.of(pathParameterValues));
        }

        public Builder pathParameterValues(String... pathParameterValues) {
            return pathParameterValues(List.of(pathParameterValues));
        }

        public Builder queryStringParameters(@Nullable Output<Map<String,String>> queryStringParameters) {
            $.queryStringParameters = queryStringParameters;
            return this;
        }

        public Builder queryStringParameters(Map<String,String> queryStringParameters) {
            return queryStringParameters(Output.of(queryStringParameters));
        }

        public EventTargetHttpTargetArgs build() {
            return $;
        }
    }

}
