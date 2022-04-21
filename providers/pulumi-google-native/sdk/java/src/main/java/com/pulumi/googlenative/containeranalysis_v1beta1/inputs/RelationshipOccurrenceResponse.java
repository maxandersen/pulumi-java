// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * RelationshipOccurrence represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipOccurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RelationshipOccurrenceResponse Empty = new RelationshipOccurrenceResponse();

    /**
     * A place for the SPDX file creator to record any general comments about the relationship
     * 
     */
    @Import(name="comment", required=true)
    private String comment;

    public String comment() {
        return this.comment;
    }

    /**
     * Also referred to as SPDXRef-A The source SPDX element (file, package, etc)
     * 
     */
    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    /**
     * Also referred to as SPDXRef-B The target SPDC element (file, package, etc) In cases where there are &#34;known unknowns&#34;, the use of the keyword NOASSERTION can be used The keywords NONE can be used to indicate that an SPDX element (package/file/snippet) has no other elements connected by some relationship to it
     * 
     */
    @Import(name="target", required=true)
    private String target;

    public String target() {
        return this.target;
    }

    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private RelationshipOccurrenceResponse() {}

    private RelationshipOccurrenceResponse(RelationshipOccurrenceResponse $) {
        this.comment = $.comment;
        this.source = $.source;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelationshipOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelationshipOccurrenceResponse $;

        public Builder() {
            $ = new RelationshipOccurrenceResponse();
        }

        public Builder(RelationshipOccurrenceResponse defaults) {
            $ = new RelationshipOccurrenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder comment(String comment) {
            $.comment = comment;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public Builder target(String target) {
            $.target = target;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RelationshipOccurrenceResponse build() {
            $.comment = Objects.requireNonNull($.comment, "expected parameter 'comment' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
