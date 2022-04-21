// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DocumentationPartArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentationPartArgs Empty = new DocumentationPartArgs();

    /**
     * The location of the targeted API entity of the to-be-created documentation part. See below.
     * 
     */
    @Import(name="location", required=true)
    private Output<DocumentationPartLocationArgs> location;

    public Output<DocumentationPartLocationArgs> location() {
        return this.location;
    }

    /**
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., &#34;{ \&#34;description\&#34;: \&#34;The API does ...\&#34; }&#34;. Only Swagger-compliant key-value pairs can be exported and, hence, published.
     * 
     */
    @Import(name="properties", required=true)
    private Output<String> properties;

    public Output<String> properties() {
        return this.properties;
    }

    /**
     * The ID of the associated Rest API
     * 
     */
    @Import(name="restApiId", required=true)
    private Output<String> restApiId;

    public Output<String> restApiId() {
        return this.restApiId;
    }

    private DocumentationPartArgs() {}

    private DocumentationPartArgs(DocumentationPartArgs $) {
        this.location = $.location;
        this.properties = $.properties;
        this.restApiId = $.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentationPartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentationPartArgs $;

        public Builder() {
            $ = new DocumentationPartArgs();
        }

        public Builder(DocumentationPartArgs defaults) {
            $ = new DocumentationPartArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<DocumentationPartLocationArgs> location) {
            $.location = location;
            return this;
        }

        public Builder location(DocumentationPartLocationArgs location) {
            return location(Output.of(location));
        }

        public Builder properties(Output<String> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(String properties) {
            return properties(Output.of(properties));
        }

        public Builder restApiId(Output<String> restApiId) {
            $.restApiId = restApiId;
            return this;
        }

        public Builder restApiId(String restApiId) {
            return restApiId(Output.of(restApiId));
        }

        public DocumentationPartArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.restApiId = Objects.requireNonNull($.restApiId, "expected parameter 'restApiId' to be non-null");
            return $;
        }
    }

}
