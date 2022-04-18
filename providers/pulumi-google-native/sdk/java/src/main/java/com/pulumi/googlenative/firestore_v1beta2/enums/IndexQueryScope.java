// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1beta2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    @EnumType
    public enum IndexQueryScope {
        /**
         * The query scope is unspecified. Not a valid option.
         * 
         */
        QueryScopeUnspecified("QUERY_SCOPE_UNSPECIFIED"),
        /**
         * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the collection id specified by the index.
         * 
         */
        Collection("COLLECTION"),
        /**
         * Indexes with a collection group query scope specified allow queries against all collections that has the collection id specified by the index.
         * 
         */
        CollectionGroup("COLLECTION_GROUP");

        private final String value;

        IndexQueryScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IndexQueryScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
