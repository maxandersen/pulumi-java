// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: &#34;Summary size limit&#34; description: &#34;Determines if a summary is less than 100 chars&#34; expression: &#34;document.summary.size() &lt; 100&#34; Example (Equality): title: &#34;Requestor is owner&#34; description: &#34;Determines if requestor is the document owner&#34; expression: &#34;document.owner == request.auth.claims.email&#34; Example (Logic): title: &#34;Public documents&#34; description: &#34;Determine whether the document should be publicly visible&#34; expression: &#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;&#34; Example (Data Manipulation): title: &#34;Notification string&#34; description: &#34;Create a notification string with a timestamp.&#34; expression: &#34;&#39;New message received at &#39; + string(document.create_time)&#34; The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 * 
 */
public final class ExprResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExprResponse Empty = new ExprResponse();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
      private final String expression;

    public String expression() {
        return this.expression;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    public ExprResponse(
        String description,
        String expression,
        String location,
        String title) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private ExprResponse() {
        this.description = null;
        this.expression = null;
        this.location = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expression;
        private String location;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ExprResponse build() {
            return new ExprResponse(description, expression, location, title);
        }
    }
}
