// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language. The syntax and semantics of CEL are documented at https://github.com/google/cel-spec. Example (Comparison): title: &#34;Summary size limit&#34; description: &#34;Determines if a summary is less than 100 chars&#34; expression: &#34;document.summary.size() &lt; 100&#34; Example (Equality): title: &#34;Requestor is owner&#34; description: &#34;Determines if requestor is the document owner&#34; expression: &#34;document.owner == request.auth.claims.email&#34; Example (Logic): title: &#34;Public documents&#34; description: &#34;Determine whether the document should be publicly visible&#34; expression: &#34;document.type != &#39;private&#39; &amp;&amp; document.type != &#39;internal&#39;&#34; Example (Data Manipulation): title: &#34;Notification string&#34; description: &#34;Create a notification string with a timestamp.&#34; expression: &#34;&#39;New message received at &#39; + string(document.create_time)&#34; The exact variables and functions that may be referenced within an expression are determined by the service that evaluates it. See the service documentation for additional information.
 * 
 */
public final class ExprArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExprArgs Empty = new ExprArgs();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression")
      private final @Nullable Output<String> expression;

    public Output<String> expression() {
        return this.expression == null ? Codegen.empty() : this.expression;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> title() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public ExprArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> expression,
        @Nullable Output<String> location,
        @Nullable Output<String> title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    private ExprArgs() {
        this.description = Codegen.empty();
        this.expression = Codegen.empty();
        this.location = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExprArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> expression;
        private @Nullable Output<String> location;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ExprArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expression(@Nullable Output<String> expression) {
            this.expression = expression;
            return this;
        }
        public Builder expression(@Nullable String expression) {
            this.expression = Codegen.ofNullable(expression);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public ExprArgs build() {
            return new ExprArgs(description, expression, location, title);
        }
    }
}
