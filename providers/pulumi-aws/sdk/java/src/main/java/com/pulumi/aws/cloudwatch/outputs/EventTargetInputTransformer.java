// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class EventTargetInputTransformer {
    /**
     * Key value pairs specified in the form of JSONPath (for example, time = $.time)
     * * You can have as many as 100 key-value pairs.
     * * You must use JSON dot notation, not bracket notation.
     * * The keys can&#39;t start with &#34;AWS&#34;.
     * 
     */
    private final @Nullable Map<String,String> inputPaths;
    /**
     * Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g., `&#34;\&#34;Your string goes here.\\nA new line.\&#34;&#34;`
     * 
     */
    private final String inputTemplate;

    @CustomType.Constructor
    private EventTargetInputTransformer(
        @CustomType.Parameter("inputPaths") @Nullable Map<String,String> inputPaths,
        @CustomType.Parameter("inputTemplate") String inputTemplate) {
        this.inputPaths = inputPaths;
        this.inputTemplate = inputTemplate;
    }

    /**
     * Key value pairs specified in the form of JSONPath (for example, time = $.time)
     * * You can have as many as 100 key-value pairs.
     * * You must use JSON dot notation, not bracket notation.
     * * The keys can&#39;t start with &#34;AWS&#34;.
     * 
    */
    public Map<String,String> inputPaths() {
        return this.inputPaths == null ? Map.of() : this.inputPaths;
    }
    /**
     * Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g., `&#34;\&#34;Your string goes here.\\nA new line.\&#34;&#34;`
     * 
    */
    public String inputTemplate() {
        return this.inputTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetInputTransformer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> inputPaths;
        private String inputTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetInputTransformer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputPaths = defaults.inputPaths;
    	      this.inputTemplate = defaults.inputTemplate;
        }

        public Builder inputPaths(@Nullable Map<String,String> inputPaths) {
            this.inputPaths = inputPaths;
            return this;
        }
        public Builder inputTemplate(String inputTemplate) {
            this.inputTemplate = Objects.requireNonNull(inputTemplate);
            return this;
        }        public EventTargetInputTransformer build() {
            return new EventTargetInputTransformer(inputPaths, inputTemplate);
        }
    }
}
